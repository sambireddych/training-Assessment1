package Assessment1;

import java.util.Scanner;

public class Driver {

	
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Please enter the name: ");
		String name = scaner.nextLine();;
		while (true) {
			if (name == null || name.equals("")) {
				System.out.println("Please enter a name again: ");
				name = scaner.nextLine();
			} else {
				Person person = new Person(name);
				System.out.println(person.toString());
				break;
			}
		}
		
	}
}
