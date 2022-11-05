package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
Output- Git, Github, Gitlab, GitBash


 */

public class Assignment4_Task2 {

	public static void main(String[] args) {
		ArrayList<String> listHavingGit = new ArrayList<>();
		System.out.println("String having git from one list to another list");
		List<String> automationTools = Arrays.asList("Git", "Github","GitLab","GitBash","Selenium","Java","Maven");
		for (int counter = 0; counter < automationTools.size(); counter++) {
			if ((automationTools.get(counter)).startsWith("Git")) {
				listHavingGit.add(automationTools.get(counter));
			}

		}
		System.out.println(listHavingGit);

	}

}
