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

    public boolean setSchedule(Schedule sch) 
    {
        
    }

    public boolean setMovieDetails(Movie mov,String name,boolean is3D,Time tim) 
    {
        mov.setMovieDetails(name, ID, is3D, tim);
        return true;
    }

    public void setNowPlaying() {
    }

    public void setUpComing() {
    }

    public void updateSchedule(Schedule sch) 
    {
        
    }

    public boolean addmovie(Movie_Data dat, Movie mov)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        dat.
       
    }

    public int removeMovie(Movie_Data dat, int movieID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
