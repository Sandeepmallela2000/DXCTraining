package dXC_Assignment;
import java.util.Scanner;

public class ArmstrongNumber
{
	public int armstrong(int n) {
 
int num,rem=0;
double sum=0;
int count=0;
  num=n;
  while(num>0)
  {
	  count++;
	  num=num/10;
  }
  n=num;
 while(num>0)
 {
	  rem=num%10;
	  //sum=sum+(rem*rem*rem);
	  sum=sum+Math.pow(rem,count);
	  num=num/10;
 }
 if(sum==n)
	 return 1;
 else
	 return 0;
 }

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		ArmstrongNumber obj=new ArmstrongNumber();
		int r=obj.armstrong(num);
		if(r==1)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		
		
		
		

	}
}


