package com.BookingPortal;

public interface BusBooking {
	void bookTickets(int tickets);
	void cancelTickets(int tickets);
	int availableTickets();
}
