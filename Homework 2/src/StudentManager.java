
public class StudentManager {
	public void register(Student student) {
	   System.out.println(student.getEmail() + " ile kayıt yapıldı");
	}

	public void registerMultiple(Student[] students) {

		for (Student student : students) {
			register(student);
		}
	}

}
