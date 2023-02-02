package dXC_Assignment;

import java.util.Scanner;

 class MovieTickets {
	private int movieId;
	private int noOfSeats;
	
	private double costPerTicket;
	
	MovieTickets(int movieId,int noOfSeats){
		this.movieId=movieId;
		this.noOfSeats=noOfSeats;
	}
	double calculateTotalAmount() {
		costPerTicket=noOfSeats;
		return costPerTicket;
	}
	public int getMovieId() {
		return movieId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public double getCostPetTicket() {
		return costPerTicket;
	}
	public void setMovieId(int movieId) {
		this.movieId=movieId;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket=costPerTicket;
	}
 
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter id from 111-113");
		int movieId=in.nextInt();
		System.out.println("enter seats");
		int noOfSeats=in.nextInt();
		MovieTickets m=new MovieTickets(movieId,noOfSeats);
		if(movieId==111) {
			System.out.println("$"+Math.round(7*m.calculateTotalAmount()));
		}
		else if(movieId==112) {
			System.out.println("$"+Math.round(8*m.calculateTotalAmount()));
		}
		else if(movieId==113) {
			System.out.println("$"+Math.round(8.5*m.calculateTotalAmount()));
		}
		else {
		
			System.out.println("Invalid");
	}
	}
	}
			
		



	
