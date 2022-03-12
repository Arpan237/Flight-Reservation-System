package FRS;

public class RegularTicket extends Ticket {
        private String specialServices = "Food, Water,Snacks";

        public RegularTicket(String pnr, String from, String to, Flight fl, String departureDateTime,
                             String arrivalDateTime, Passenger pa, String seatNO, float price, boolean cancelled) {
            super(pnr, from, to, fl, departureDateTime, arrivalDateTime, pa, seatNO, price, cancelled);
            this.specialServices = specialServices;
        }

        public String getSpecialServices() {
            return specialServices;
        }

        public void updateSpecialsServices(String specialServices) {
            this.specialServices = specialServices;
        }


    }

