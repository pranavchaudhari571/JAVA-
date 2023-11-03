package Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Custom_Exception.PublicationException;
import Publication.Books;
import Publication.Publication;
import Publication.Tape;

public class PublicationUtil {
	Scanner sc = new Scanner(System.in);

	public static void addbook(String title, double price, String publishDate, int ratings, int pagecount,
			List<Publication> list) throws PublicationException {

		try {
		list.add(new Books(title, price, LocalDate.parse(publishDate), ratings, pagecount));}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new PublicationException("Someting wrong in the input");
		}
		
	}

	public static void addTape(String title, double price, String publishDate, int ratings, int time,
			List<Publication> list) throws PublicationException {

		try {
		list.add(new Tape(title, price,LocalDate.parse(publishDate), ratings, time));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new PublicationException("Someting wrong in the input");
		}
	}
	public static void Printining_the_list(List<Publication> list) {
		System.out.println("Here is the all the publicatiom");
		list.forEach(p->System.out.println(p));
	}
	public static List<Publication> populate() {
		List<Publication> list=new ArrayList<Publication>();
		
		list.add(new Books("Book 1", 500.0, LocalDate.parse("2023-10-11"), 9, 120));
		list.add(new Tape("Tape 2", 450.0, LocalDate.parse("2023-09-15"), 8, 90));
		list.add(new Books("Books 2", 550.0, LocalDate.parse("2023-08-20"), 7, 150));
		list.add(new Tape("Tape 4", 400.0, LocalDate.parse("2023-06-05"), 6, 60));
		list.add(new Books("Book 5", 600.0, LocalDate.parse("2023-05-10"), 9, 180));
		list.add(new Tape("Tape 6", 350.0, LocalDate.parse("2022-12-25"), 8, 45));
		list.add(new Books("Book 7", 700.0, LocalDate.parse("2022-11-30"), 7, 200));
		list.add(new Tape("Tape 8", 300.0, LocalDate.parse("2022-10-07"), 6, 30));
		list.add(new Books("Book 9", 750.0, LocalDate.parse("2017-09-12"), 9, 210));
		list.add(new Tape("Tape 10", 250.0, LocalDate.parse("2022-07-18"), 8, 20));
		return list;
	}

}
