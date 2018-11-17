
import java.util.ArrayList;

public class Online_Client extends Now_Playing {
    

    public ArrayList<Movie> seeNowPlaying()
    {
    return getThisMonthMoviesArray();
    }

    public int giveReservationID(Ticket One) 
    {
        return One.getID();
    }



}
