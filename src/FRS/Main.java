package FRS;

public class Main {

        public static void main(String[] args) {
            Passenger passenger = new Passenger("West Bengal", "Kolkata", "Picnic Garden", "Arpan", "+981123455670", "sh@gmail.com");
            Flight flight = new Flight("FL234AEZ" , "Air India" , 35 ,28);
            RegularTicket regularTicket = new RegularTicket("PNRRT2584", "Tripura", "kolkata", flight, "Air India", "1:50", passenger, "3:00", 4630.70f, false);
            TouristTicket touristTicket = new TouristTicket("PNRTT4285", "Mumbai", "kolkata", flight, "Air India", "1:50", passenger, "3:00", 4630.70f, false);
            printTicketDetails(regularTicket);
            printTicketDetails(touristTicket);
        }


        public static void printTicketDetails(Ticket ticket) {
            System.out.println(ticket.getPnr());
        }
    }



