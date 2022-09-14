package com.BookingPortal;

public class BusBookingImpl implements BusBooking{
	int totalTickets;
//	int bookTickets_;
	final int totalMaxTkts;
	public BusBookingImpl(int totalTickets) {
		totalMaxTkts=totalTickets;
		this.totalTickets=totalTickets;
	}

	@Override
	public void bookTickets(int n) {
//		this.bookTickets_=n;
//		if(availableTickets()>0) {
//			System.out.println("booking tickets.."+n);
			totalTickets=totalTickets-n;
//		}
	}
	@Override
	public void cancelTickets(int n) {
		totalTickets=totalTickets+n;
	}
	@Override
	public int availableTickets() {
//		if(totalTickets>=bookTickets_)return totalTickets;		
		return totalTickets;
	}
}
