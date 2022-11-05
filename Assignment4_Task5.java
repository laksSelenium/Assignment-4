package assignment_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Create a list which can accept another list as an element.
           List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
  	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
 */

public class Assignment4_Task5 {

	public static void main(String[] args) {
		//List<Integer> numbers = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		
		ArrayList<Integer> list2 =  new ArrayList<>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
		
		ArrayList<ArrayList<Integer>> list4 = new ArrayList<>();
		list4.add(list1);
		list4.add(list2);
		list4.add(list3);
		
		System.out.println("List having 3 lists are:");
		System.out.println(list4);
		

	}

}
