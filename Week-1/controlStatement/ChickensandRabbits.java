package dxc;

import java.util.Scanner;

public class ChickensandRabbits {
	static int countRabbits(int Heads,int Legs) {
		int count=0;
		count=(Legs)-2*(Heads);
		count=count/2;
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Heads,Legs;
		System.out.println("enter heads");
		Heads=sc.nextInt();
		System.out.println("enter Legs");
		Legs=sc.nextInt();
		int Rabbits=countRabbits(Heads,Legs);
		if(Legs%2==0)
		{
		System.out.println("Rabbits"+Rabbits);
		System.out.println("Chickens"+(Heads-Rabbits));
		}
		else
		{
		System.out.println("Invalid");
		}

	}

}
