public class Seller extends Reserver {

    private Ticket One;
    public Ticket SetTicket(Movie mov,int hallID,Payment pay,char seatgroup,Time tim) 
    {
         tim=mov.getTimeOfPlay();
            pay.CalcPrice(mov, tim, seatgroup);
        One.setMoviename(mov.getName());
One.setHallID(hallID);
One.setTime(tim);
One.setSeatgroup(seatgroup);
return One;
    }
}
