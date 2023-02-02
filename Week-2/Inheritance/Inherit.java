package dxc_Next;
class Employee {

	 int employeeId;
	 String employeeName;
	 double salary;
	 public Employee(int employeeId, String employeeName) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeename(String employeename) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		

	 //Uncomment the below method after implementation before verifying
	 //DO NOT MODIFY THE METHOD
	 
	 public String toString(){
	 return "Employee\nemployeeId: "+this.getEmployeeId()+"\n employeeName:"
	+this.getEmployeeName()+"\n salary: "+this.getSalary();
	 }
	 
	}
	class PermanentEmployee extends Employee {

		double basicPay;
		double hra;
		float experience;
		public PermanentEmployee(int employeeId,String employeeName,double basicPay,double hra,float experience)
		{
			super(employeeId, employeeName);
			this.basicPay=basicPay;
			this.hra=hra;
			this.experience=experience;
			
		}
		void calculatemonthlysalary() {
			double variablecomponent=0;
			if (experience<3) {
				 variablecomponent=0;
				
			}else if(experience>=3&&experience<5){
				 variablecomponent=basicPay * 0.05;
				
			}else if (experience>=5&&experience<10) {
				 variablecomponent= basicPay *0.07;
				
			}else if (experience>=10) {
				 variablecomponent= basicPay *0.12;
			}
			salary = Math.round((basicPay+hra+variablecomponent));
		}
		public double getBasicPay() {
			return basicPay;
		}
		public void setBasicPay(double basicPay) {
			this.basicPay = basicPay;
		}
		public double getHra() {
			return hra;
		}
		public void setHra(double hra) {
			this.hra = hra;
		}
		public float getExperience() {
			return experience;
		}
		public void setExperience(float experience) {
			this.experience = experience;
		}
		

	 //Uncomment the below method after implementation before verifying
	 //DO NOT MODIFY THE METHOD
	 
	 public String toString(){
	 return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName:"
	+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra:"
	+this.getHra()+"\nexperience: "+this.getExperience();
	 }
	 
	}
	class ContractEmployee extends Employee {

		double wage;
		float hoursWorked;
		public ContractEmployee(int employeeId,String employeeName,double wage,float hoursWorked){
			super(employeeId, employeeName);
			this. wage=wage;
			this.hoursWorked=hoursWorked;
			
		}
		void calculateSalary() {
			salary= hoursWorked*wage;
		}
		public double getWage() {
			return wage;
		}
		public void setWage(double wage) {
			this.wage = wage;
		}
		public float getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(float hoursWorked) {
			this.hoursWorked = hoursWorked;
		}

	 //Uncomment the below method after implementation before verifying
	 //DO NOT MODIFY THE METHOD
	 
	 public String toString(){
	 return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName:"
	+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage:"
	+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
	 }
	 
	}
	public class Inherit {

	 public static void main(String[] args) {

	 PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855,
	115, 3.5f);
	 permanentEmployee.calculatemonthlysalary();
	 System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());

	 ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	 contractEmployee.calculateSalary();
	 System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());

	 //Create more objects for testing your code
	 }

	}




