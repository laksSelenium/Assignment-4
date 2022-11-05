package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90
 */

public class Assignment4_Task4 {

	public static void main(String[] args) {
		//List<Integer> numbers = new ArrayList<>();
		
		List<Integer> numbers = Arrays.asList(10,45, 90,45, 23, 90, 44);
		int listSize = numbers.size();
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(numbers.size()-2));

	}

}
