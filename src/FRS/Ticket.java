package FRS;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight fl;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger pa;
    private String seatNO;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, Flight fl, String departureDateTime, String arrivalDateTime, Passenger pa, String seatNO, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.fl = fl;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.pa = pa;
        this.seatNO = seatNO;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFl() {
        return fl;
    }

    public void setFl(Flight fl) {
        this.fl = fl;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPa() {
        return pa;
    }

    public void setPa(Passenger pa) {
        this.pa = pa;
    }

    public String getSeatNO() {
        return seatNO;
    }

    public void setSeatNO(String seatNO) {
        this.seatNO = seatNO;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }





        public String checkStatus() {
            if (cancelled) {
                return "Cancelled";
            }
            {
                return "Confirmed";
            }
        }
            public int getFlightDuration() {
                int duration = Integer.parseInt(departureDateTime) - Integer.parseInt(arrivalDateTime);
                return duration;
            }

            public void cancel () {
                cancelled = true;


                }


            }



