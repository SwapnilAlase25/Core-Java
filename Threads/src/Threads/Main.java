package Threads;

public class Main {

	public static void main(String[] args) {

		TicketBooking[] tickets = new TicketBooking[15];

		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new TicketBooking();
			tickets[i].setName("T:" + i);
		}

		for (int i = 0; i < tickets.length; i++) {
			tickets[i].start();
		}

	}

}
