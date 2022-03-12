package FRS;

    public class TouristTicket extends Ticket {
        private String hotelAddress;
        private String[] selectedTouristLocation;

        public TouristTicket(String pnr, String from, String to, Flight f, String departureDateTime,
                             String arrivalDateTime, Passenger p, String seatNO, float price, boolean cancelled) {
            super(pnr, from, to, f, departureDateTime, arrivalDateTime, p, seatNO, price, cancelled);
            this.hotelAddress = "Novotel Mumbai Juhu Beach";
            this.selectedTouristLocation = new String[5];
        }

        public String getHotelAddress() {
            return hotelAddress;
        }

        public String[] getTouristLocations() {
            for (int i = 0; i < 5; i++) {
                System.out.println(selectedTouristLocation[i]);
            }
            return selectedTouristLocation;
        }

        public void removeTouristLocations(String location) {
            int index = Integer.parseInt(location);
            int[] array = new int[selectedTouristLocation.length - 1];
            for (int i = 0; i < selectedTouristLocation.length; i++) {
                if (i == index) {
                    continue;
                }
                array[i] = Integer.parseInt(selectedTouristLocation[i]);
            }

        }

        public void addTouristLocations(String location){
            int index = Integer.parseInt(location);
            int[] array2 = new int[selectedTouristLocation.length + 1];
            for (int i = 0; i< selectedTouristLocation.length ; i++){
                if (i == index) {
                    continue;
                }
                array2[i] = Integer.parseInt(selectedTouristLocation[i]);
            }
        }
    }

