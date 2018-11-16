public class Online_Client extends Now_Playing {
    

    public Movie[] seeNowPlaying()
    {
    return getthisMonthMoviesArray();
    }

    public int giveReservationID(Ticket One) 
    {
        return One.getID();
    }

}
