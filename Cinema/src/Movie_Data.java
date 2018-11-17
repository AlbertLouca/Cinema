import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Movie_Data extends Manager implements IFile  {
//public int s=0; //----------------------------------------------------------->
   // private Movie movieArray[]=new Movie [Now_Playing.cap*2];
    private ArrayList<Movie> movieArray=new ArrayList<Movie>(Now_Playing.cap*2);
  //  private Hall arrayHalls[];
    private ArrayList<Movie> arrayHalls=new ArrayList<Movie>();
     public boolean checkSeatAvailability(Hall hall,int pos,char group) {
      Seat s;
      s=hall.getseat(group, pos);
        
      if( s.isIsAvailable())
      {
          hall.getseat(group, pos).reserve();
          return true;
      }
   return false; 
     }
     public boolean setMovieArray(Movie temp[])
    {
        int i=0;
        while(i<Now_Playing.cap*2&&temp[i]!=null)
        {
            movieArray.add(i, temp[i]);
            
            i++;
        }
        if(i>0)
        {
            return true;
        }
        else
        return false;
    }
        
            public boolean addMovie(Movie mov)
    {
        for(int i=0;i<Now_Playing.cap*2;i++)
            
        {
            
                movieArray.add( mov);
                        return true;
            
        }
        return false;
    }
        
        //**************************************************************************
        
    public boolean removeMovie(int movieID) //throws IOException, ClassNotFoundException
    { 
        for(int i=0;i<Now_Playing.cap*2;i++)
        {
            if(movieArray.get(i).getID()==movieID)
            {
                movieArray.remove(i);
                return true;
                
            }
       
       }
     return false;
    }
    @Override
   public boolean save()
    {
        try ( /*--------saves movies details--------*/
                ObjectOutputStream nim = new ObjectOutputStream (new FileOutputStream("C:\\Users\\PC\\Desktop\\New.bin"))) {
                nim.writeObject(movieArray);
            nim.close();
            return true;
        }
        catch (Exception e) 
        { 
         return false;   
        }
   }
    
   
    
    @Override
    public boolean load()
// throws FileNotFoundException
    {
        try 
        {
            ObjectInputStream nin = new ObjectInputStream (new FileInputStream("C:\\Users\\PC\\Desktop\\New.bin"));
             movieArray  =(ArrayList<Movie>) nin.readObject();
            nin.close();
            return true;
        }
catch (Exception e)
        {
       
        }
    return false;
    } 
}
