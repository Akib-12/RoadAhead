package roadahead;
/**
 * @author AQIB
 */
class User {
    private String name;
    private int seatNum, bookedSeats, availableSeats;
    
    public User(String name, int seatN, int bookedS, int availS) {
        this.name = name;
        this.seatNum = seatN;
        this.bookedSeats = bookedS;
        this.availableSeats = availS;
    }
 
    public String getName() {
        return name;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    
}
