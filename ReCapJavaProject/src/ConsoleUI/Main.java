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
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@engin.com");
		instructor.setExperience("Yazılım Geliştirme Danışmanı");

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Barış");
		student.setLastName("Aslan");
		student.setEmail("baris@baris.com");
		student.setUniversity("Çanakkale Onsekiz Mart");
		student.setDepartment("Bilgisayar Mühendisliği");

		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.update(instructor);
		userManager.delete(instructor);

		userManager.add(student);
		userManager.update(student);
		userManager.delete(student);
	}

}
