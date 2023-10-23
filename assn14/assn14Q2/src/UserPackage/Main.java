package UserPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add a Candidate");
		System.out.println("2. Update Candidate Details");
		System.out.println("3. Delete the User");
		System.out.println("4. Display all users.");
//		System.out.println("5. Display all Books");
//		System.out.println("6. Display all DVDs");
//		System.out.println("Enter the Choice");

		choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int choice;

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {

				User u = new User();
				u.accept(sc);
				try (UserDAO Dao = new UserDAO()) {
					int cnt = Dao.addUser(u);
					System.out.println("Rows Inserted " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				} // catch
			} // case 1
				break;
			case 2: {

				System.out.println("Enter the ID of user to Update the Name");
				int id = sc.nextInt();
				System.out.println("Enter the Updated Name");
				String name = sc.next();
				User u = new User(id, name);
				try (UserDAO Dao = new UserDAO()) {
					int cnt = Dao.updateUser(u);
					System.out.println("Rows Updated " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				} // catch
			} // case 2
				break;

			case 3: {

				System.out.println("Enter the ID of user to Delete");
				int id = sc.nextInt();

				User u = new User(id);
				try (UserDAO Dao = new UserDAO()) {
					int cnt = Dao.deleteUser(u);
					System.out.println("Rows deleted " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				} // catch
			} // case 3
				break;

			case 4: {


				User u = new User();
				try (UserDAO Dao = new UserDAO()) {
					List<User> list =Dao.printUser(u);
					for (User user : list) {
						System.out.println(user);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} // catch
			} // case 3
				break;
			}// switch

		} // while
	}// main
}// class
