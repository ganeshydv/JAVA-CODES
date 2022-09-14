package com.BookingPortal;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BusBookingImpl ref=new BusBookingImpl(50);
		while(true) {
			System.out.println("-------------------");
			//			System.out.println("");
			System.out.println("1)book ticket 2)check available tickets 3) cancel Tickets 4)Exit");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("enter number of tickets to book :");
				int tkt=sc.nextInt();
				System.out.println("checking for ticket availablity ...");
				if(ref.availableTickets()>tkt) {
					System.out.println("booking "+tkt+" tickets...booked...");
					ref.bookTickets(tkt);
				}else {
					try {
						throw new TicketsNotAvailableExcption();
					}catch (TicketsNotAvailableExcption e) {
						System.out.println(e.getMessage()); 
					}
				}
				break;
			case 2:
				System.out.println("available tickets are "+ref.availableTickets());
				break;
			case 3:
				System.out.println("enter number of tickets to cancel :");
				int tkt2=sc.nextInt();
				System.out.println("checking .....");
				if(ref.totalTickets==ref.totalMaxTkts) {
					System.out.println("sorry you have not booked any tickets yet....");
				}else if(ref.totalMaxTkts>=ref.totalTickets+tkt2) {
					System.out.println("canceling  "+tkt2+" tickets....");
					ref.cancelTickets(tkt2);
				}else {
					int a=ref.totalMaxTkts-ref.availableTickets();
					System.out.println("you can cancel only "+a+" tickets");
				}
				break;

			case 4:
				System.out.println("thank you...");
				System.exit(0);
				break;
			default:
				System.out.println("sorry wrong choice....select again...");

			}

		}

	}

}
