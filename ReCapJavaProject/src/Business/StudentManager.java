package Business;

import Entities.User;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla Eklendi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla Güncellendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla Silindi.");
	}
}
