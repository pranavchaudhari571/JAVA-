package Tester;

import java.util.List;
import java.util.Scanner;

import Custom_Exception.PenCustomException;
import Enum.Brand;
import Enum.Material;
import Pen.Pen;
import Validations.AddMaterial;

public class Tester {

	public static void main(String[] args) throws PenCustomException {
		// TODO Auto-generated method stub
		List<Pen> list = AddMaterial.populated();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			try {
				System.out.println("**********************Menu********** " + "\n1)add pen+" + "2)printing list of stock"
						+ " \n3)Update Stock of pen" + "\n4)set discount for perticular date" + "\n5)remove old pen");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {

				case 0:
					System.out.println("****exit***********");
					exit = true;
					break;

				case 1:
					System.out.println("****Entered add pen option*****");

					System.out.println(
							"Enter brand Like Cello,Parker raynold,flair\ncolor\nink color\nMaterial like plastic alloy steel \nquantity,\nprice");
					AddMaterial.addmaterial(Brand.valueOf(sc.next().toUpperCase()), sc.next(), sc.next(),
							Material.valueOf(sc.next().toUpperCase()), sc.nextInt(), sc.nextDouble(), 0, list);

					break;
				case 2:
					System.out.println("Pring the things");
					AddMaterial.print_list(list);
					break;
				case 3:
					System.out.println("update stock of pen enter id and stock how much u want to enter");

					AddMaterial.update_stock(sc.nextInt(), sc.nextInt(), list);

					break;
				case 4:
					System.out.println("Here we r setting discount 20 for lesss than 3 month people");
					AddMaterial.adddiscount(list);
					break;
				case 5:
					System.out.println("Herer we 9 months");
					AddMaterial.removing_col(list);
					break;

				case 6:
					System.out.println("Here we are removing elemnt which is less than 3 months");

				default:
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				sc.nextLine();
			}

		}

	}

}
