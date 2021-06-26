
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstname("Melisa");
		student1.setLastname("Caner");
		student1.setAge(20);
		student1.setEmail("melisa@gmail.com");
		student1.setPassword("0516");
		student1.setId(001);
		
		Student student2 = new Student();
		student2.setFirstname("Zeynep");
		student2.setLastname("Özen");
		student2.setAge(20);
		student2.setEmail("zoz@gmail.com");
		student2.setPassword("1108zoz");
		student2.setId(002);
		
		Instructor instructor1 =new Instructor();
		instructor1.setAbout("...");
		instructor1.setEmail("ogretmen.22@gmail.com");
		instructor1.setPassword("ogretmenlikzorzanaat");
		instructor1.setId(1);
		
		Instructor instructor2 = new Instructor();
		instructor2.setAbout("...");
		instructor2.setEmail("ogretmen11@gmail.com");
		instructor2.setPassword("zorzanaatogretmenlik");
		instructor2.setId(2);
		
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.account(instructor2);
		
		

	}

}
