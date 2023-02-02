package dXC_Assignment;
import java.util.Scanner;

 class Bmi_Calc {

		    private double weight;
		    private double height;
		    private double bmi;

		    
		    Bmi_Calc(double weight, double height) {
		        this.weight = weight;
		        this.height = height;
		    }

		   
		    public void calculateBMI() {
		        bmi = (weight * 703) / (height * height);
		    }

		 
		    public String getWeightStatus() {
		        if (bmi < 18.5) {
		            return "You are underweight.";
		        } else if (bmi < 25) {
		            return "You are at a normal weight.";
		        } else if (bmi < 30) {
		            return "You are overweight.";
		        } else {
		            return "You are obese.";
		        }
		    }

		  
		    public double getBMI() {
		        return bmi;
		    }
		}

		 class Bmi__Calc {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        
		        System.out.print("Enter your weight in pounds: ");
		        double weight = input.nextDouble();

		        
		        System.out.print("Enter your height in inches: ");
		        double height = input.nextDouble();

		        Bmi_Calc bmiCalculator = new Bmi_Calc(weight, height);

		       
		        bmiCalculator.calculateBMI();
		       

		        
		        System.out.println("Your BMI is: " + bmiCalculator.getBMI());

		        
		        System.out.println(bmiCalculator.getWeightStatus());
		    }
		}


	


