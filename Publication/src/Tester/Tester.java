
package Tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Custom_Exception.PublicationException;
import Publication.Books;
import Publication.Publication;
import Util.PublicationUtil;

public class Tester {

	public static void main(String[] args) throws PublicationException {
		// TODO Auto-generated method stub
		try (Scanner sc=new Scanner(System.in)){
		List<Publication> list=PublicationUtil.populate();
		boolean exit=true;
		
		
		
		
			while(exit) {
				
			System.out.println("*************************Menu******************");
			System.out.println("0)To EXIT"
					+ "\n1):Publish new Book"
					+ "\n2)Publish New Tape"
					+ "\n3)printing all"
					+ "\n4)List all book publicatio"
					+ "n ordered by publish date in decending order"
					+ "\n5)List top 5 publication of current year based on rating"
					+ "\n6)Remove all publica tion which are 5 year old");
			
			
		try {
		switch (sc.nextInt()) {
		case 1:System.out.println("You have Enterd the thing to add a book 1) Enter title\n2) Enter the price\n3) Enter publish date in yyyy-mm-dd\n4) Enter Rating \n5) Enter PageCount");
		PublicationUtil.addbook(sc.next(), sc.nextDouble(),sc.next(), sc.nextInt(), sc.nextInt(), list);
			
			break;
			case 2:
				System.out.println("You have Enterd to add a Tape 1) Enter title\n2) Enter the price\n3) Enter publish date in yyyy-mm-dd\n4) Enter Rating \n5) Enter time of recording in hr");;
				PublicationUtil.addTape(sc.next(), sc.nextDouble(),sc.next(), sc.nextInt(), sc.nextInt(), list);
				break;
			case 3:System.out.println("Youe have Entered to print the All publication");
			PublicationUtil.Printining_the_list(list);
			
				break;
			case 4:System.out.println("Printing Top 5 book");
//			List<Books> listbookBooks=list.stream()
//					.filter(publication -> publication instanceof Book)
//					.map(publicationv -> (Book) publication).
//					sorted(Comparator)
//			List<Books> books = list.stream()
//		            .filter(publication -> publication instanceof Books)
//		            .map(publication -> (Books) publication)
//		            .sorted(Comparator.comparing(Books::getPublishDate).reversed())
//		            .collect(Collectors.toList());
//					books.forEach(p->System.out.println(p));
//			
//			list.stream()
//		    .filter(publication -> publication instanceof Books)
//		    .sorted((p2,p1)->p1.getPublishDate().compareTo(p2.getPublishDate()))
//		     .forEach(p->System.out.println(p));     
			list.stream()
		    .filter(publication -> publication instanceof Books)
		    .sorted(Comparator.comparing(Publication::getPublishDate))
		     .forEach(p->System.out.println(p));   
					break;
			case 5:

				list.stream()
				.filter(p->(p.getPublishDate()).getYear()==LocalDate.now().getYear())
			    .sorted((p2,p1)->((Integer)p1.getRatings()).compareTo(p2.getRatings())).limit(5)
			     .forEach(p->System.out.println(p));    
				break;
				
				
			case 6:
//			list.removeIf((p)->{
//				if (Period.between(p.getPublishDate(), LocalDate.now()).toTotalMonths()>60)
//					return true;
//				return false;
//				
//			});
				System.out.println("Removing 5 year old publication");
				LocalDate fiveyrDate=LocalDate.now().minusYears(5);
				list.removeIf(p->p.getPublishDate().isBefore(fiveyrDate));
			break;
					
			case 0:exit=false;
				break;
				

		default:
			break;
		}
		}	
				catch (Exception e) {
					// TODO: handle exception
			e.printStackTrace();
			sc.nextLine();
					
					
				
				}
			}}
		finally {
			System.out.println("Main Over");
		}
		
		
		
	}	
	}

