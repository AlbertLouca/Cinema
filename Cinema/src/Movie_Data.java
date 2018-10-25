
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



//import java.io.FileNotFoundException;


/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger; */

public class Movie_Data extends Manager implements IFile  {
//public int s=0; //----------------------------------------------------------->
    private Movie movieArray[]=new Movie [Now_Playing.cap*2];

    private Hall arrayHalls[];
    public String[] UnToken(String Line){
     String result[]=new String[20];
     String Word="";
     int ctr=0;
     for(int i=0;i<Line.length();i++){
         if(Line.charAt(i)!='~'){
             Word=Word+Line.charAt(i); 
         }
         else {
             result[ctr]=Word;
             ctr++;
             Word=new String();
         }
     }
     return result;
     
 }

    public boolean checkSeatAvailability(int hallNo,int pos,char group) {
       Seat s;
        s=arrayHalls[hallNo].getseat(group, pos);
        
      if(s.isIsAvailable())
      {
          return true;
      }
      return false;
    }
    
    public boolean setMovieArray(Movie temp[])
    {
        int i=0;
        while(i<Now_Playing.cap*2&&temp[i]!=null)
        {
            movieArray[i]=temp[i];
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
            if(movieArray[i]==null)
            {
                movieArray[i]=movie;
                        return true;
            }
        }
        return false;
    }
    public boolean removeMovie(int movieID)
    {
          for(int i=0;i<Now_Playing.cap*2;i++)
        {
            if(movieArray[i].getID()==movieID)
            {
                movieArray[i]=null;
                for(int j=i;j<(Now_Playing.cap*2)-1;j++)
                {
                    movieArray[j]=movieArray[j+1];
                }
                        return true;
                        
                        
            }
        }
        return false;
    }
    
    
    
    public boolean save() throws FileNotFoundException
    {
        /*--------saves movies details--------*/
        File myFile=new File("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt");
        PrintWriter writer=new PrintWriter(new File(myFile));
        for(int i=0;i<Now_Playing.cap*2;i++){
               
                //BufferedWriter write=new BufferedWriter(movieArray[s].getName()+"~");
                
                write.println(movieArray[i].getID()+"~"+movieArray[i].getName()+"~"+movieArray[i].getTimeOfPlay().getHour()+"~"+movieArray[i].getTimeOfPlay().getMin()+"~"+movieArray[i].isIs3D()+"~"+movieArray[i].isNowPlaying()+"~");
                 } write.close();
                 
                 
         /*-------saves hall details---------*/
         myFile=new File("C:\\Users\\MHDSA\\Documents\\CINEMA\\hallsData.txt");
         PrintWriter writer=new PrintWriter(new File(myFile));
                for(int i=0;i<3;i++)
                { 
                    for(int j=0;j<6;j++)
                    {
                        for(int k=0;k<10;k++)
                        {
                            
                        }
                    }
                } 
                 
        
    }
    
   
    
    public boolean load()// throws FileNotFoundException
    {
        try // throws FileNotFoundException
        {
            File myFile=new File("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt");
            Scanner sc=new Scanner(myFile);
            int hour,min;
            //Time t=new Time();
            int ctr=0;
            int i=0;
            while(sc.hasNext())
            {
                String line=sc.nextLine();
                String []separated=UnToken(line);
                //    movieArray[i].setID((int)separated[i]);
                movieArray[i].setID(Integer.parseInt(separated[0]));
                movieArray[i].setName(separated[1]);
                //  hour=(int)separated[i+2];
                hour=(Integer.parseInt(separated[2]));
                // min=(int)separated[3];
                min=(Integer.parseInt(separated[3]));
                movieArray[i].setTimeOfPlay(hour,min);
                // movieArray[i].setIs3D((boolean)separated[4]);
                movieArray[i].setIs3D( Boolean.parseBoolean(separated[4]) );
                // movieArray[i].isNowPlaying((boolean)separated[5]);
                movieArray[i].setNowPlaying( Boolean.parseBoolean(separated[5]));
                ctr++;
                i++;
            }
            if(ctr>0){
                return true;
            }
            else
                return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Movie_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
 /* 
    @Override
    public void load()
    {
        File myFile=new File("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt");
        Scanner scan1=new Scanner(System.in);
        
    try {
        String myString;
        BufferedReader read=new BufferedReader(new FileReader("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt"));
        while(scan1.hasNext()){
            myString=read.readLine();
            
        }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Movie_Data.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Movie_Data.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void save() {
        File myFile=new File("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt");
        
        
            try {
                 BufferedWriter write=new BufferedWriter(new FileWriter("C:\\Users\\MHDSA\\Documents\\CINEMA\\moviesData.txt"));
                for(int i=0;i<s;){
               
                //BufferedWriter write=new BufferedWriter(movieArray[s].getName()+"~");
                write.write(movieArray[s].getName()+"~"+s+"~");
                 } write.close();  
            } catch (IOException ex) {
                Logger.getLogger(Movie_Data.class.getName()).log(Level.SEVERE, null, ex);
            
    }*/

