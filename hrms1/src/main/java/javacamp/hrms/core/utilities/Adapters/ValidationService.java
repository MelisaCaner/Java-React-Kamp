package javacamp.hrms.core.utilities.Adapters;


public interface ValidationService {
	
	boolean validateByMernis(long nationality_Id, String firstName, String lastName, int birthYear);
}
