package Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Basic.Status;
import Basic.Task;
import Custom_Exc.Task_customEcx;

public class TaskUtil {
	static Scanner sc = new Scanner(System.in);

	public static void AddingTask(List<Task> list) throws Task_customEcx {
		System.out.println("*********");
		System.out.println("Enter taskname,taskDiscripption,taskdate");
		try {
			list.add(new Task(sc.next().toLowerCase(), sc.next(), LocalDate.parse(sc.next())));
		} catch (Exception e) {

			throw new Task_customEcx("You have entered someting wrong input while creating task");
		}
	}

	public static void delete_task(List<Task> list) throws Task_customEcx {
		System.out.println("Enter the name of task u want to delete");

		int index = list.indexOf(new Task(sc.nextLine().toLowerCase()));
		System.out.println("You are removing this task" + list.get(index));
		list.remove(index);
		System.out.println("removed");

	}

	public static void Update_task_status(List<Task> list) throws Task_customEcx {
		System.out.println("Enter the name of task u want to update");
		try {
			int index = list.indexOf(new Task(sc.nextLine().toLowerCase()));
			System.out.println("You are changing status of this task this task" + list.get(index));
			Task t = list.get(index);
			String str = sc.next().toUpperCase();
			if (str.equals("COMPLETED")) {
				t.setActive(false);
			}
			t.setStatus(Status.valueOf(str));
			t.setTaskDate(LocalDate.now());
			System.out.println("Changed the status");
		} catch (Exception e) {
			// TODO: handle exception
			throw new Task_customEcx("you have entered something wrong");
		}
	}

	public static void displaypending(List<Task> list) {
		System.out.println("Displaying the pending task");
//		for (Task task : list) {
//			if (task.getStatus() == Status.PENDING) {
//				System.out.println(task);
//			}
//		}
		list.stream().filter(p->p.getStatus()==Status.PENDING)
		.forEach(p->System.out.println(p));
	}

	public static void displaybydate(List<Task> list) {
		System.out.println("Sorting by date");
		list.stream().sorted((p1, p2) -> p1.getTaskDate().compareTo(p2.getTaskDate()))
				.forEach(p -> System.out.println(p));
	}

	public static List<Task> populate() {
		List<Task> list = new ArrayList<Task>();
		list.add(new Task("homework1", "You have to do java homework on collection. This is the task.",
				LocalDate.parse("2023-11-12")));
		list.add(new Task("homework2", "You have to complete your math homework.", LocalDate.parse("2023-11-13")));
		list.add(new Task("homework3", "Finish your science homework assignment.", LocalDate.parse("2023-11-14")));
		list.add(new Task("homework4", "Complete the history homework.", LocalDate.parse("2023-11-15")));
		list.add(new Task("homework5", "Submit your English homework.", LocalDate.parse("2023-11-16")));
		list.add(new Task("homework6", "Do the programming homework in C++.", LocalDate.parse("2023-11-17")));
		list.add(new Task("homework7", "Prepare for the upcoming chemistry homework.", LocalDate.parse("2023-11-18")));
		list.add(new Task("homework8", "Read the assigned chapters for your literature homework.",
				LocalDate.parse("2023-11-19")));
		list.add(new Task("homework9", "Solve the practice problems for your physics homework.",
				LocalDate.parse("2023-11-20")));
		list.add(new Task("homework10", "Complete the geography homework on time.", LocalDate.parse("2023-11-21")));
		list.add(new Task("homework11", "Finish your economics homework assignment.", LocalDate.parse("2023-11-22")));
		list.add(new Task("homework12", "Submit your Spanish homework.", LocalDate.parse("2023-11-23")));
		list.add(new Task("homework13", "Do the computer science homework.", LocalDate.parse("2023-11-24")));
		list.add(new Task("homework 14", "Prepare for the upcoming psychology homework.",
				LocalDate.parse("2023-11-25")));
		list.add(new Task("homework 15", "Read the assigned chapters for your sociology homework.",
				LocalDate.parse("2023-11-26")));

		return list;
	}
	
	
	public static void displayallpendforday(List<Task> list) {
		for (Task task : list) {
			if(task.getTaskDate()==LocalDate.now() && task.getStatus()==Status.PENDING) {
				System.out.println(task);
			}
		}
		list.stream().filter(p->(p.getTaskDate()==LocalDate.now())&&(p.getStatus()==Status.PENDING))
		.forEach(p->System.out.println(p));
	}

}
