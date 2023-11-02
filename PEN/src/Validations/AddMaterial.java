package Validations;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Custom_Exception.PenCustomException;
import Enum.Brand;
import Enum.Material;
import Pen.Pen;

public class AddMaterial {

	static Scanner sc = new Scanner(System.in);

	public static void addmaterial(Brand brand, String color, String inkcolor, Material material, int quantity,
			double price, double discount, List<Pen> list) {

		System.out.println(
				"Enter brand Like Cello,Parker raynold,flair\n ink color\n Material like plastic alloy steel \n quantity,\nprice\n Enter the stock date"
						+ "" + "" + "");
		Pen pen = new Pen(brand, color, inkcolor, material, quantity, price, discount, LocalDate.parse(sc.next()));
		try {
			list.add(pen);
			System.out.println("Pen is added");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sc.nextLine();
		}

	}

	public static void print_list(List<Pen> list) {
		list.forEach(i -> System.out.println(i));

	}

	public static void update_stock(int id, int stock, List<Pen> list) throws PenCustomException {
		Pen p = new Pen(id);
		if(p==null) {
			throw new PenCustomException("U have Entered wrong input id");
		}
		else if(stock<0) {
			throw new PenCustomException("Stock can,t be negative");
		}
		int index = list.indexOf(p);
		if (p.getId() == id) {
			list.get(index).setStock(stock);
			System.out.println("set the stock");
			list.get(index).setUpdate_date(LocalDate.now());
			System.out.println("Date is also updated");
			return;
		} else {
			throw new PenCustomException("Pen is not avilable");

		}
	}

	public static List<Pen> populated() {
		List<Pen> list = new ArrayList<Pen>();
		list.add(new Pen(Brand.CELLO, "black", "black", Material.ALLOY, 15, 20, 0, LocalDate.parse("2023-03-03")));
		list.add(new Pen(Brand.FLAIR, "black", "black", Material.METAL, 45, 25, 0, LocalDate.parse("2023-09-03")));
		list.add(new Pen(Brand.CELLO, "red", "blue", Material.PLASTIC, 35, 15, 0, LocalDate.parse("2023-08-13")));
		list.add(new Pen(Brand.REYNOLDS, "pink", "yellow", Material.STEEL, 55, 32, 0, LocalDate.parse("2020-02-03")));
		list.add(new Pen(Brand.PARKER, "green", "red", Material.PLASTIC, 0, 15, 0, LocalDate.parse("2020-05-03")));
		return list;
	}

	public static void removing_col(List<Pen> list) {
		LocalDate ninem = LocalDate.now().minusMonths(9);
		list.removeIf(Pen -> Pen.getListing_date().isBefore(ninem));
//		list.re

		list.forEach(p -> System.out.println(p));
		System.out.println("removed the stock");
	}

	public static void adddiscount(List<Pen> list) {
		list.stream().filter(p -> (Period.between(p.getListing_date(), LocalDate.now()).toTotalMonths() < 3))
				.forEach(p -> {
					p.setDiscount(20);
					System.out.println(p);
				});
	}

}
