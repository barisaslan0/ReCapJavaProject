package Business;

import Entities.User;

public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " E�itmen Ba�ar�yla Eklendi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " E�itmen Ba�ar�yla G�ncellendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " E�itmen Ba�ar�yla Silindi.");
	}
}
