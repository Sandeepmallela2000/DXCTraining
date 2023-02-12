package dxc_Next;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
        	return null;
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of list:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Integer result = max(list);
        if (result == null) {
            System.out.println("The list is empty or null.");
        } else {
            System.out.println("The maximum value in the list is: " + result);
        }
        
    }
}


