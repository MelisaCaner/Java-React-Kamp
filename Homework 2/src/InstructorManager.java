public class InstructorManager {
	public void account(Instructor instructor) {
	 System.out.println(instructor.getEmail() + " ile giri� yap�ld�");
	}

	 public void accountMultiple(Instructor[] instructors) {

			for (Instructor instructor : instructors) {
				account(instructor);
			}
	}
}

