package tester;

import java.util.Scanner;

import point.Point2D;

public class TestsPoints {

	public static void main(String[] args) {

		int choice = 1;
		Scanner sc = new Scanner(System.in);
		Point2D[] points = new Point2D[10];
		int i = -1;
		while (choice != 0) {
			System.out.println("********Menu*********");
			System.out.println("1.Plot a point \n 2.Display Point \n 3.find \n 0: Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int flag = 0;
				System.out.println("Enter x & y points ");
				Point2D temp = new Point2D(sc.nextFloat(), sc.nextFloat());
				if (i > -1) {
					for (int j = 0; j <= i; j++) {
						if (points[j].isEqual(temp)) {
							// System.out.println("found");
							flag = 1;
						}

					}
					if (flag == 1) {
						System.out.println("Point is already plotted !!! cant plot twice");
						break;
					} else {
						points[++i] = temp;
					}

				} else {
					points[++i] = temp;
				}
				break;
			case 2:
				System.out.println("Displaying All Points: ");
				for (int j = 0; j <= i; j++) {
					System.out.println(points[j].getDetails());
				}
				break;

			case 3:
				System.out.println("Enter 2 indices for checking is equal if not equal calculate distance:");
				int point1, point2;
				point1 = sc.nextInt();
				point2 = sc.nextInt();
				if (points[point1].isEqual(points[point2])) {
					System.out.println("This two points are equal");
				} else {
					System.out.println("Calculating Distance between entered two points");
					System.out.println("Distance is : " + points[point1].calculateDistance(points[point2]));

				}
				break;
				
			case 0:
				System.out.println("Bye :)");
				System.exit(0);
			default:
				System.out.println("Invalid choice");

			}

		}
		sc.close();

	}

}
