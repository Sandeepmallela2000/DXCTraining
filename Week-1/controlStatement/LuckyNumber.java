package dXC_Assignment;
import java.util.Scanner;

public class LuckyNumber {

		public static void main(String[] args) {
			int reverse=0,count=0;
			int num,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num");
			int n=sc.nextInt();
			num=n;
			while(n>0)
			{
				n=n/10;
				count++;
			}
			while(num!=0)
			{
				int digit=num%10;
				reverse=reverse*10+digit;
				num /=10;
			}
			int position=1,evenpos;
		while(reverse>0)
		{
			if(position%2==0)
			{
				evenpos=reverse%10;
				sum=sum+evenpos*evenpos;
			}
			reverse=reverse/10;
			position++;
		}
	
	if(sum%9==0) {
		System.out.println(" number");
	}
	else
	{
		System.out.println("not Lucky number");
	}
}
}