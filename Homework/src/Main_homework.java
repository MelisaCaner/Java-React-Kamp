
public class Main_homework {

	public static void main(String[] args) {
		course course1 = new course("C# + ANGULAR", "Engin Demiroğ", "ücretsiz");
		course course2 = new course("Java + React", "Engin Demiroğ", "ücretsiz");
		course course3 = new course("Programlamaya Giriş", "Engin Demiroğ", "ücretsiz");

		course[] courses = { course1, course2, course3 };

		for (course course : courses) {
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
			System.out.println(course.coursePay);

		}
		courseManager courseManager = new courseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
	}
}
