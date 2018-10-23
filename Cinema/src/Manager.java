public class Manager extends User {

    Manager()
    {
     ID=1;
    
    }
  
    public boolean resetHallData(Hall hall) 
    {
        hall=new Hall();        //calls for the constructor to 
        return true;
    }

    public void setSchedule() 
    {
        
    }

    public void setMovieDetails() {
    }

    public void setNowPlaying() {
    }

    public void setUpComing() {
    }

    public void updateSchedule() {
    }

    public boolean addmovie(Movie_Data dat, Movie mov) {
       // throw new UnsupportedOperationException("Not supported yet.");
       
    }

    public int removeMovie(Movie_Data dat, int movieID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
