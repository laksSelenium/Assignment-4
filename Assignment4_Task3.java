package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven



 */

public class Assignment4_Task3 {

	public static void main(String[] args) {
		ArrayList<String> listRemovedDuplicates = new ArrayList<>();
		System.out.println("List after deleting duplicate String");
		List<String> listHavingDuplicates = Arrays.asList("Java", "TestNG", "Maven", "Java");
		Iterator<String> it = listHavingDuplicates.iterator();
		while (it.hasNext()) {
			String textToVerify = it.next();
			if (!listRemovedDuplicates.contains(textToVerify)) {
				listRemovedDuplicates.add(textToVerify);
			}

		}
		System.out.println(listRemovedDuplicates);

	}

}
