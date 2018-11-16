public class Now_Playing extends Movie {
     public static final int cap=10;
    private Movie thisMonthMoviesArray[]=new Movie [cap];

    public Now_Playing() {
        for (int i=0;i<10;i++){
        thisMonthMoviesArray[i]=null;
        
        }
        }
 public boolean setthisMonthMoviesArray(Movie[] thisMonthMoviesArray,int userID) {
     if(userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
         if(thisMonthMoviesArray[i].isNowPlaying()==true){
         this.thisMonthMoviesArray[i]=thisMonthMoviesArray[i];
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
   if(thisMonthMoviesArray[i]==null){
       thisMonthMoviesArray[i]=movie;
       return true;
   
  }
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(thisMonthMoviesArray[i].getID()==movieiD){
     thisMonthMoviesArray[i]=null;
 for(int j=i;j<(Now_Playing.cap*2)-1;j++ ){
 thisMonthMoviesArray[j]=thisMonthMoviesArray[j=1];
 
 }
     return true ;       
     }
     
     
     }
    
  }
    return false;
    }
   
 
 
 

   public Movie[] getthisMonthMoviesArray() {
        return thisMonthMoviesArray;
    }

   
     public int getCap() {
        return cap;
    }
    
}
//this.thisMonthMoviesArray = laterMoviesArray;
