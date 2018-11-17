
import java.util.ArrayList;


public class Now_Playing extends Movie {
     public static final int cap=10;
    //private Movie thisMonthMoviesArray[]=new Movie [cap];
    private ArrayList<Movie> thisMonthMoviesArray= new ArrayList<Movie> (cap);

    public Now_Playing() {
        for (int i=0;i<10;i++){
        thisMonthMoviesArray.set(i,null);
        
        }
        }
 public boolean setthisMonthMoviesArray(Movie[] thisMonthMoviesArray,int userID) {
     if(userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
         if(thisMonthMoviesArray[i].isNowPlaying()==true){
         this.thisMonthMoviesArray.set(i, thisMonthMoviesArray[i]);
         }   
     }
     return true;
     }
     else{
     return false;}
    }
 
 
  public boolean update(Movie movie,int userID){
    if(userID==1){
     
   for(int i=0;i<Now_Playing.cap;i++){

       thisMonthMoviesArray.add(i, movie);
       return true;
   
  
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(thisMonthMoviesArray.get(i).getID()==movieiD){
     thisMonthMoviesArray.remove(i);

     return true ;       
     }
     
     
     }
    
  }
    return false;
    }
   
 

   
     public ArrayList<Movie> getThisMonthMoviesArray() {
        return thisMonthMoviesArray;
    }

    public int getCap() {
        return cap;
    }
    
}
//this.thisMonthMoviesArray = laterMoviesArray;
