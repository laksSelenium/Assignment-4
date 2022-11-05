package assignment_4;

import java.util.Arrays;
import java.util.List;

/*
 * Create a list of String and print the values in reverse order
Input – Java, Selenium, TestNG, Git, Github
	Output- Github, Git, TestNG, Selenium, Java

 */

public class Assignment4_Task1 {

	public static void main(String[] args) {
		System.out.println("String from list in reverse order");
		List<String>listToReverse = Arrays.asList("Java","Selenium","TestNG","Git","Github");
		for(int counter=(listToReverse.size()-1);counter>=0;counter--) {
			System.out.println(listToReverse.get(counter));
			
		}

	}

}
