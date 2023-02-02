package dxc;
import java.util.Scanner;

public class SportsExample {
	String s_name;
	long s_code;
	int fees,duration;
	SportsExample()
	{
		s_name="Cric";
		s_code=1001;
		fees=500;
		duration=70;
	}
	void newSportsExample()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter code");
		s_code=sc.nextLong();
		System.out.println("enter name");
		s_name=sc.nextLine();
		System.out.println("enter duration");
		duration=sc.nextInt();
		if(s_name.equalsIgnoreCase("table tennis"))
		{
			fees=2000;
		}
		else if(s_name.equalsIgnoreCase("Swimming"))
		{
			fees=4000;
		}
		else if(s_name.equalsIgnoreCase("football"))
		{
			fees=3000;
		}
	}
		void displaySportsExample()
		{
			System.out.println("Code"+s_code);
			System.out.println("Sports name"+s_code);
			System.out.println("Duration"+duration);
			System.out.println("Fees"+fees);
			
		}
		
		
	}

	
