package Business;

import Entities.User;

public class StudentManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Öðrenci Baþarýyla Eklendi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Öðrenci Baþarýyla Güncellendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Öðrenci Baþarýyla Silindi.");
	}
}
