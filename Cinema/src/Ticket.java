public class Ticket {
private int hallID;
private String moviename;
private char seatgroup;

    public char getSeatgroup() {
        return seatgroup;
    }

    public void setSeatgroup(char seatgroup) {
        this.seatgroup = seatgroup;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
private Time time;
    public Ticket() {
       hallID=0;
       moviename="";
   price=0;
    }

private int price;
    private int ID;
    

    public int getID() {
        return ID;
    }

    public boolean setID(int ID) {
        if (ID>=0)
        {
             ID++;
        this.ID = ID;
        return true;
        }
        else 
             return false ;
                    
                
       
    }
public Time Get_Time (Movie mov) throws Exception {
                    return mov.getTimeOfPlay();
}

    public int getHallID() {
        return hallID;
    }

    public void setHallID(int hallID) {
        this.hallID = hallID;
    }


}
