package com.BookingPortal;

public class TicketsNotAvailableExcption extends RuntimeException {
	public String getMessage() {
		return "not enough tickets";
	}

}
