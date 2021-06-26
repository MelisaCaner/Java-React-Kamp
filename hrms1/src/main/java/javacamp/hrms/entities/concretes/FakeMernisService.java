package javacamp.hrms.entities.concretes;

public class FakeMernisService {
	public boolean ValidateByPersonalInfo(long nationalityId, String first_name, String last_name, int birthYear)
	{
	System.out.println(first_name + " " + last_name + " is valid person." );
	return true;
	}

}
