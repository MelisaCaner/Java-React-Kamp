public class InstructorManager {
	public void account(Instructor instructor) {
	 System.out.println(instructor.getEmail() + " ile giriþ yapýldý");
	}

	 public void accountMultiple(Instructor[] instructors) {

			for (Instructor instructor : instructors) {
				account(instructor);
			}
	}
}

