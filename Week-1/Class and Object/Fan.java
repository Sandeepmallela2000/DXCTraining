package dXC_Assignment;
import java.util.Scanner;

 class Fan {
	 int Speed;
		Boolean Condition;
		String Colour;
		int radius;
		public int getSpeed() {
			return Speed;
		}


		public void setSpeed(int speed) {
			Speed = speed;
		}


		public Boolean getCondition() {
			return Condition;
		}


		public void setCondition(Boolean condition) {
			Condition = condition;
		}


		public String getColour() {
			return Colour;
		}


		public void setColour(String colour) {
			Colour = colour;
		}


		public int getRadius() {
			return radius;
		}


		public void setRadius(int radius) {
			this.radius = radius;
		}


		
		
		public  void  output()
		 {
			boolean condition;
			int speed;
			String colour;
			double radius;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Fan Condition");
			condition= sc.nextBoolean();
			System.out.println("Enter the Fan Speed");
			speed= sc.nextInt();
			System.out.println("Enter the Fan colour");
			colour= sc.next();
			System.out.println("Enter the Fan radius");
			radius= sc.nextDouble();
			
			if(condition == true)
			{
				System.out.println("Fan is ON"+ "It is at a Speed of "+ speed + " Colour is "+ colour+ "Radius of Fan is "+ radius);
			}
			else
			{
				System.out.println("Fan is Off"+ "Colour of Fan is "+ colour + "Radius is " + radius);
			}
		 }
	}

	 class Fan_Regulator {

		public static void main(String[] args) {
			
		
		Fan f1 = new Fan();
		
		f1.setCondition(false);
		f1.setColour("Blue");
		f1.setRadius(7);
		f1.setSpeed(2);
		f1.getCondition();
		f1.getColour();
		f1.getRadius();
		f1.getSpeed();
		
		System.out.println("Status of Fan is "+ f1.getCondition()+" , "+" Colour is " + f1.getColour()+" , "+ "Radius is "+ f1.getRadius()+ "  , "+"Speed is "+ f1.getSpeed());
		
		
		
		
		}

		

	}

 

	

	


