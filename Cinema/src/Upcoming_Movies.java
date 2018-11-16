public class Upcoming_Movies extends Movie {
 
private Movie laterMoviesArray[]=new Movie [Now_Playing.cap];
public Upcoming_Movies(){
    for(int i=0;i<10;i++){
    laterMoviesArray[i]=null;
    
    }
    }

    public boolean setLaterMoviesArray(Movie[] laterMoviesArray,int userID) {
       if(userID==1){ 
           for(int i=0;i<Now_Playing.cap;i++){
               if(laterMoviesArray[i].isNowPlaying()==false)
               this.laterMoviesArray[i] = laterMoviesArray[i];
           
           
           }
           return true;
       
       }
       else{
       return false;}
    }
  

 public boolean update(Movie movie,int userID){
    if(userID==1){
     
   for(int i=0;i<Now_Playing.cap;i++){
   if(laterMoviesArray[i]==null){
       laterMoviesArray[i]=movie;
       return true;
   
  }
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(laterMoviesArray[i].getID()==movieiD){
     laterMoviesArray[i]=null;
 for(int j=i;j<(Now_Playing.cap*2)-1;j++ ){
 laterMoviesArray[j]=laterMoviesArray[j=1];
 
 }
     return true ;       
     }
     
     
     }
    
  }
    return false;
    }
   
public Movie[] getLaterMoviesArray() {
        return laterMoviesArray;
    }
 
     public int getCap() {
        return Now_Playing.cap;
    }
   }
//this.laterMoviesArray = laterMoviesArray;
