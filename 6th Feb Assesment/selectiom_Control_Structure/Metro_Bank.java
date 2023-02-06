package selectiom_Control_Structure;
import java.util.Scanner;
class bankLoan {
    int accountNumber;
	double accountBalance;
	double salary;
	String loanType;
	double expectedLoanAmount;
	double expectedEmi;
	
	public bankLoan(int accountNumber, double accountBalance, double salary, String loanType, double expectedLoanAmount,double expectedEmi) {
		
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.salary = salary;
		this.loanType = loanType;
		this.expectedLoanAmount=expectedLoanAmount;
		this.expectedEmi = expectedEmi;
		
}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getExpectedLoanAmount() {
		return expectedLoanAmount;
	}
	public void setExpectedLoanAmount(double expectedLoanAmount) {
		this.expectedLoanAmount = expectedLoanAmount;
	}
	public double getExpectedEmi() {
		return expectedEmi;
	}
	public void setExpectedEmi(double expectedEmi) {
		this.expectedEmi =expectedEmi;
	}
	public void Stat(){
	if(accountNumber>999&&accountNumber<2000)

	{
		if (accountBalance >= 1000) {
			if (salary > 25000 && loanType == "Car") {

				if (expectedEmi <= 36 && expectedLoanAmount <= 500000) {
					System.out.println("AccountNumber:" + accountNumber);
					System.out.println("EligibleLoanAmount:" + 500000);
					System.out.println("EligibleEmis :" + 36);
					System.out.println("RequestedLoanAmount:" + 300000);
					System.out.println("RequestedEmis:" + 30);
				} else {
					System.out.println(" Not eligible for loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 50000 && loanType == "House") {

				if (expectedEmi <= 60 && expectedLoanAmount <= 6000000) {
					System.out.println("Accountnumber:" + accountNumber);
					System.out.println("customerAvailable Rs." + expectedLoanAmount);
					System.out.println("EligibleEmis :" + 60);
					System.out.println("RequestedLoanAmount:" + 6000000);
					System.out.println("RequestedEmis:" + expectedEmi);
				} else {
					System.out.println(" Not eligible for loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 75000 && loanType == "Business") {

				if (expectedEmi <= 80 &&expectedLoanAmount <= 7500000) {
					System.out.println("AccountNumber:" + accountNumber);
					System.out.println("EligibleLoanAmount:" + 6000000);
					System.out.println("EligibleEmis :" + 60);
					System.out.println("RequestedLoanAmount:" + 500000);
					System.out.println("RequestedEmis:" + expectedEmi);

				} else {
					System.out.println(" Not eligible for loan");
				}
			}

		}

	}else
	{
		System.out.println("Invalid acc. number");
	}
	}
	}
public class Metro_Bank{
	public static void main(String[] args) {
		bankLoan Customer=new bankLoan(1001,40000,250000,"Car",300000,30);
		Customer.Stat();
	
	}
}
 

