public class Schedule {
   private Movie movies[]= new Movie[Now_Playing.cap];
  
    Schedule() {
       
        for(int i=0;i<Now_Playing.cap;i++ )  {
            movies[i]=null;
        }
       
      }

    public boolean setSchedule(Movie movies[], int userID) {
     if(userID==1){
         for(int i=0;i<Now_Playing.cap*2;i++ ){
             
         this.movies [i]=movies[i];
         
         
         }
          
        return true;}
     else{
         return false;
     }
    }
    public boolean update(Movie movie,int userID){
    if(userID==1){
     
   for(int i=0;i<Now_Playing.cap;i++){
   if(movies[i]==null){
       movies[i]=movie;
       return true;
   
  }
  
   }
 
    }
    return false;
    
  }
    public boolean Remove(int movieiD, int userID){
    if (userID==1){
     for(int i=0;i<Now_Playing.cap;i++){
     if(movies[i].getID() ==movieiD){
     
     movies[i]=null;
     for(int j=i;j<(Now_Playing.cap*2)-1;j++ ){
 movies[j]=movies[j=1];
 
 }
     return true ;       
     }
     
     
     }
    
  }

    return false;
    }
 
    public Movie[] getMovies(){
        return movies;
}

    
}
