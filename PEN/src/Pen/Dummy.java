package Pen;

import java.text.Collator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = List.of(10, 20, 30, 40, 50, 60, 70, 50, 80, 90, 100, 120, 123);
		li.forEach(p -> System.out.print(p + " "));
		List<Integer> newlist = li.stream().filter(i -> i > 50).collect(Collectors.toList());
        System.out.println("\n***************");
		newlist.forEach(i->System.out.print(i+" "));
		
	}

}
