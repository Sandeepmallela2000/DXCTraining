package collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListTwo {
	public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
	    //Implement your logic here and change the return statement accordingly
		Set<Integer> set = new HashSet<>(listOne);
        List<Integer> commonElements = new ArrayList<>();
        for (Integer num : listTwo) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
		
	}
	
	public static void main(String arga[]){

		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(12);
		listOne.add(21);
		listOne.add(1);
		listOne.add(53);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(11);
		listTwo.add(21);
		listTwo.add(25);
		listTwo.add(53);
		listTwo.add(47);

		System.out.println(findCommonElements(listOne,listTwo));
	}

}
