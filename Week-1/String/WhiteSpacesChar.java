package dXC_Assignment;
import java.util.Scanner;

public class WhiteSpacesChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String str=sc.nextLine();
		str=str.replaceAll("\\s","");
		System.out.println(str);

	}

}
