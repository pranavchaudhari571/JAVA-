package Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Basic.Task;
import Util.TaskUtil;

public class Task_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc=new Scanner(System.in)){
			
		
		List<Task> list=TaskUtil.populate();
		boolean exit=true;
		
		while(exit) {
			System.out.println("\n\n///*********Menu**********///");
			System.out.println("\n1. Add New Task                       \r\n"
					+ "2. Delete a task                         \r\n"
					+ "3. Update task status               \r\n"
					+ "4. Display all pending tasks     \r\n"
					+ "5. Display all pending tasks for today           \r\n"
					+ "6. Display all tasks sorted by taskDate        \r\n"
					+ "0. to Exit");
			System.out.println("Enter the choice::::");
			
			try{
				switch (sc.nextInt()) {
			
			case 0:
				exit=false;
				
				break;
			case 1:System.out.println("Adding new task");
			TaskUtil.AddingTask(list);
				break;
			case 2:
				TaskUtil.delete_task(list);
				break;
			case 3:
				TaskUtil.Update_task_status(list);
				break;
			case 4:
				TaskUtil.displaypending(list);
				break;
			case 5:
				TaskUtil.displayallpendforday(list);
				break;
			case 6:
				TaskUtil.displaybydate(list);
				break;
			case 7:
				break;

			default:System.out.println("Invalid input bro!!!!!");
				break;
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				sc.nextLine();
			}
			
			
		}
		
		
		
		
		}
		finally {
			System.out.println("main is over finally");
		}
	}
}
