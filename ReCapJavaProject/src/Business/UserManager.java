package Business;

import Entities.User;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Baþarýyla Eklendi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Baþarýyla Güncellendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Baþarýyla Silindi.");
	}
}
