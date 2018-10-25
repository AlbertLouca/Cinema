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

    public boolean setSchedule(Schedule sch,Movie []movies) 
    {
        return sch.setSchedule(movies, ID);
        
    }

    public boolean setMovieDetails(Movie mov,String name,boolean is3D,Time tim) 
    {
        mov.setMovieDetails(name, ID, is3D, tim);
        return true;
    }

    public boolean setNowPlaying(Now_Playing currentmovies,Movie movie []) {

      return currentmovies.setthisMonthMoviesArray(movie, ID);


    }
    public boolean setUpComing(Upcoming_Movies comingmovies , Movie movie [] ) {
return comingmovies.setLaterMoviesArray(movie, ID);


    
    }

    public boolean updateSchedule(Schedule sch, Movie mov) 
    {
        return sch.update(mov, ID);
    }

    public boolean addmovie(Movie_Data dat, Movie mov)
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        return dat.addMovie(mov);
       
    }

    public boolean removeMovie(Movie_Data dat, int movieID) {
        //throw new UnsupportedOperationException("Not supported yet.");
    
        return dat.removeMovie(movieID);
    }
}
