package ConsoleUI;

import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setEmail("engin@engin.com");
		instructor.setExperience("Yaz�l�m Geli�tirme Dan��man�");

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Bar��");
		student.setLastName("Aslan");
		student.setEmail("baris@baris.com");
		student.setUniversity("�anakkale Onsekiz Mart");
		student.setDepartment("Bilgisayar M�hendisli�i");

		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.update(instructor);
		userManager.delete(instructor);

		userManager.add(student);
		userManager.update(student);
		userManager.delete(student);
	}

}
