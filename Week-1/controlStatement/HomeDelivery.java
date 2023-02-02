package dxc;
import java.util.Scanner;

public class HomeDelivery {

	public static void main(String[] args) {
		int deli_fee,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter V or N");
		char c=sc.next().charAt(0);
		System.out.println("enter quantity");
		int qu=sc.nextInt();
		System.out.println("enter distance");
		int dis=sc.nextInt();
		if(c=='V' || c=='v')
		{
			if(dis>0 && dis<=3)
			{
				deli_fee=0;
				total=deli_fee+qu*12;
			}
			else if(dis>3 && dis<=6){
				deli_fee=1;
				total=deli_fee+qu*12;
			}
			else if(dis>6)
			{
				deli_fee=2;
				total=qu*12+(dis-5)*2+1;
			}
			else
			{
				System.out.println("invalid");
			}
		}
		else if(c=='N' || c=='n')
		{
			if(dis>0 && dis<=3)
			{
				deli_fee=0;
				total=deli_fee+qu*15;
			}
			else if(dis>3 && dis<=6){
				deli_fee=1;
				total=deli_fee+qu*15;
			}
			else if(dis>6)
			{
				deli_fee=2;
				total=qu*15+(dis-5)*2+1;
			}
			else
			{
				System.out.println("invalid");
			}
		}
		else {
			System.out.println("enter valid input");
		}
		System.out.println("Total"+total);

	}

}
