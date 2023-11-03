package tester;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		int counter = 0;
		System.out.println("Please enter the basket size:");
		Fruit[] fruits = new Fruit[sc.nextInt()];// create array of fruits as basket datastructure

		while (!done) {
			System.out.println("**********Menu*************");
			System.out.println("1: Add Mango\n2: Add Orange\n3: Add Apple\n"
					+ "4: Display All fruits\n5: Display all fresh fruit Info\n6:Mark As Stale\n7: Mark all sour as stale \n8:Invoke Fruit Specific Functionality \n 9:Exit");
			System.out.println("Enter the choice");
			switch (sc.nextInt()) {
			case 1:// Add mango
				if (counter < fruits.length) {

					fruits[counter++] = new Mango();
					System.out.println("Added Mango!");

				} else
					System.out.println("Basket is Fulled");
				break;
			case 2:// add Orange
				if (counter < fruits.length) {

					fruits[counter++] = new Orange();//counter++;
					System.out.println("Added Orange!");

				} else
					System.out.println("Basket is Fulled");
				break;

			case 3:// add apple

				if (counter < fruits.length) {

					fruits[counter++] = new Apple();
					System.out.println("Added Apple!");

				} else
					System.out.println("Basket is Fulled");
				break;
			case 4:// display all fruits
				for (Fruit fruit : fruits)
					if (fruit != null)
						System.out.println(fruit);
				break;
			case 5:// display only fresh
				for (Fruit fruit : fruits)
					if (fruit != null)
						if (fruit.isFresh())
							System.out.println(fruit);
				break;
			case 6:// mark as stale
				System.out.println("Enter Index");
				int index = sc.nextInt();
				if (index > 0 && index <= counter) {
					fruits[index - 1].setFresh(false);
					System.out.println("Marked Stale");
				}

				else
					System.out.println("INVALID INDEX!!	");
				break;
			case 7:// Mark all sour fruit stale
				System.out.println("Marking all sour as stale ");
				int c = 0;
				for (Fruit fruit : fruits) {
					if (fruit != null) {
						if (fruit.taste().equals("Sour")) {
							fruit.setFresh(false);
							c++;
						}
					}
				}
				System.out.println(c + " Marked as Stale");
				break;

			case 8:// Calling specific functionality
				for (Fruit fruit : fruits) {
					if (fruit != null) {
						if (fruit instanceof Apple) {
							((Apple) fruit).jam();
						} else if (fruit instanceof Mango) {
							((Mango) fruit).pulp();

						} else if (fruit instanceof Orange) {
							((Orange) fruit).juice();

						}
					}
				}
				break;
			case 9:// exit
				done = true;
				System.out.println("Bye!..........  :)");
				break;

			}
		}
		sc.close();
	}

}
