import java.util.Scanner;

class FlightTicketScanner
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter PNR Number:");
		long PNRNumber = s.nextLong();
		System.out.println("Enter Passenger Name:");
		String passengerName = s.next();
		System.out.println("Enter Passenger age:");
		int age = s.nextInt();
		System.out.println("Enter Passenger gender:");
		char gender = s.next().charAt(0);
		System.out.println("Enter Flight Number:");
		String flightNumber = s.next();
		System.out.println("Enter Airplane Name:");
		String airlaneName = s.next();
		System.out.println("Enter Source:");
		String source = s.next();
		System.out.println("Enter Destination:");
		String destination = s.next();
		System.out.println("Enter Seat Number:");
		String seatNumber = s.next();
		System.out.println("Enter Ticket Price:");
		double ticketPrice = s.nextDouble();
		System.out.println("Enter Travel Date:");
		String travelDate = s.next();
		System.out.println("Enter Baggage Weight:");
		float baggageWeight = s.nextFloat();
		System.out.println("Enter CheckIn Status:");
		String checkinStatus = s.next();
		System.out.println("Enter Ticket Status:");
		String ticketStatus = s.next();
		
		System.out.println(" ");
		
		System.out.println("PNRNumber = "+PNRNumber);
		System.out.println("passengerName = "+passengerName);
		System.out.println("age = "+age);
		System.out.println("gender = "+gender);
		System.out.println("flightNumber = "+flightNumber);
		System.out.println("airlaneName = "+airlaneName);
		System.out.println("source = "+source);
		System.out.println("destination = "+destination);
		System.out.println("seatNumber = "+seatNumber);
		System.out.println("ticketPrice = "+ticketPrice);
		System.out.println("travelDate = "+travelDate);
		System.out.println("baggageWeight = "+baggageWeight);
		System.out.println("checkinStatus = "+checkinStatus);
		System.out.println("ticketStatus = "+ticketStatus);
	}
}
