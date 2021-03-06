package javacamp.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.AuthService;
import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.business.abstracts.EmployersService;
import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.business.abstracts.VerificationCodesService;
import javacamp.hrms.core.utilities.Adapters.ValidationService;
import javacamp.hrms.core.utilities.results.ErrorResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.core.verifications.VerificationService;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.Employers;
import javacamp.hrms.entities.concretes.VerificationCode;


@Service
public class AuthManager implements AuthService {
	private UserService userService;
    private EmployersService employersService;
    private CandidatesService candidatesService;
    private VerificationService verificationService;
    private ValidationService validationService;
    private VerificationCodesService verificationCodesService;
    
    @Autowired
    public AuthManager(UserService userService, EmployersService employersService, CandidatesService candidatesService,
            VerificationService verificationService, ValidationService validationService,
            VerificationCodesService verificationCodesService) {
        super();
        this.userService = userService;
        this.employersService = employersService;
        this.candidatesService = candidatesService;
        this.verificationService = verificationService;
        this.validationService = validationService;
        this.verificationCodesService = verificationCodesService;
    }

 

    @Override
    public Result registerEmployer(Employers employers, String confirmPassword) {
        if (!checkIfNullInfoForEmployer(employers)) {

            return new ErrorResult("Eksik bilgi girdiniz.L??tfen t??m bo??luklar?? doldurunuz");
        }

        if (!checkIfEqualEmailAndDomain(employers.getEmail(), employers.getWebAddress())) {

            return new ErrorResult("Ge??ersiz email");
        }

        if (!checkIfEmailExists(employers.getEmail())) {

            return new ErrorResult(employers.getEmail() + " b??yle bir email zaten kay??tl??");
        }

        if (!checkIfEqualPasswordAndConfirmPassword(employers.getPassword(), confirmPassword)) {

            return new ErrorResult("Parolalar uyu??muyor");
        }
        
        employersService.add(employers);
        String code = verificationService.sendCode();
        verificationCodeRecord(employers.getId(), code, employers.getEmail());
        return new SuccessResult("Kay??t olma i??lemi ba??ar??yla ger??ekle??tirildi");
    }
    
    @Override
    public Result registerCandidates(Candidates candidates, String confirmPassword) {
        if (checkIfRealPerson(Long.parseLong(candidates.getNationalityId()), candidates.getFirstName(),
                candidates.getLastName(), candidates.getDateOfBirth().getYear()) == false) {
            return new ErrorResult("TC kimlik no do??rulanamad??");
        }
        
        if (!checkIfNullInfoForCandidate(candidates, confirmPassword)) {

            return new ErrorResult("Eksik bilgi girdiniz.L??tfen t??m bo??luklar?? doldurunuz");
        }

        if (!checkIfExistsNationalityId(candidates.getNationalityId())) {

            return new ErrorResult(candidates.getNationalityId() + " b??yle bir kimlik numaras?? zaten kay??tl??");
        }

        if (!checkIfEmailExists(candidates.getEmail())) {

            return new ErrorResult(candidates.getEmail() + " b??yle bir email zaten kay??tl??");
        }
        
        candidatesService.add(candidates);
        String code = verificationService.sendCode();
        verificationCodeRecord(candidates.getId(), code, candidates.getEmail());
        return new SuccessResult("Kay??t olma i??lemi ba??ar??yla ger??ekle??tirildi");
    }

    private boolean checkIfExistsNationalityId(String nationalityId) {
        if(this.candidatesService.getCandidateByNationalityId(nationalityId).getData() == null) {
            return true;
        }
        return false;
    }

    private boolean checkIfNullInfoForCandidate(Candidates candidates, String confirmPassword) {
        if(candidates.getFirstName() != null && candidates.getLastName() != null && 
        		candidates.getNationalityId() != null && candidates.getDateOfBirth() != null 
        		&& candidates.getPassword() != null 
        		&& candidates.getEmail() != null 
        		&& confirmPassword != null) {
        return true;
        }
        return false;
    }

    private boolean checkIfRealPerson(long nationality_Id, String firstName, String lastName, int birthYear) {
        if(validationService.validateByMernis(nationality_Id, firstName, lastName, birthYear)) {
        return true;
        }
    return false;
    }

    private void verificationCodeRecord(int id, String code, String email) {
        VerificationCode verificationCode = new VerificationCode(id,code,false);
        this.verificationCodesService.add(verificationCode);
        System.out.println("Do??rulama kodu " + email + "inize g??nderildi.");
        
    }

    private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {
        if(!password.equals(confirmPassword)) {
            return false;
        }
        return true;
    }

    private boolean checkIfEmailExists(String email) {
        if(this.userService.getUsersByEmail(email).getData() == null) {
            return true;
        }
        return false;
    }

    private boolean checkIfEqualEmailAndDomain(String email, String website) {
        String[] emailArr = email.split("@",2);
        String domain = website.substring(4,website.length());
        
        if(emailArr[1].equals(domain)) {
            return true;
        }
        return false;
    }

    private boolean checkIfNullInfoForEmployer(Employers employers) {
        if (employers.getCompanyName() != null && employers.getWebAddress() != null &&
                employers.getEmail() != null && employers.getPhoneNumber() != null
                && employers.getPassword() != null) {
        return true;
        }
        return false;        
    }
	
	

}
