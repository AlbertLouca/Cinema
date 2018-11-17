
import java.util.ArrayList;

public class Upcoming_Movies extends Movie {
 
//private Movie laterMoviesArray[]=new Movie [Now_Playing.cap];
private ArrayList <Movie> laterMoviesArray =new ArrayList <Movie> (Now_Playing.cap);
public Upcoming_Movies(){
    for(int i=0;i<10;i++){
    laterMoviesArray.set(i, null);
    
    }
    }

    public boolean setLaterMoviesArray(Movie[] laterMoviesArray,int userID) {
       if(userID==1){ 
           for(int i=0;i<Now_Playing.cap;i++){
               if(laterMoviesArray[i].isNowPlaying()==false)
               this.laterMoviesArray.set(i, laterMoviesArray[i]);
    }
           return true;
  }
       else{
       return false;}
    }
  

 public boolean update(Movie movie,int userID){
    if(userID==1){
     
   for(int i=0;i<Now_Playing.cap;i++){

       laterMoviesArray.add(i, movie);
       return true;
   
  
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(laterMoviesArray.get(i).getID()==movieiD){
     laterMoviesArray.remove(i);

     return true ;       
     }
    }
  }
    return false;
    }
   
public ArrayList<Movie> getLaterMoviesArray() {
        return laterMoviesArray;
    }
 
     public int getCap() {
        return Now_Playing.cap;
    }
   }
//this.laterMoviesArray = laterMoviesArray;
