
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Movie_Data extends Manager implements IFile  {
public int s=0; //----------------------------------------------------------->
    private Movie movieArray[]=new Movie [s];

    private Hall arrayHalls[];
    

    public boolean checkSeatAvailability(int hallNo,int pos,char group) {
       Seat s;
        s=arrayHalls[hallNo].getseat(group, pos);
      if(s.checkAvailability())
      {
          return true;
      }
      return false;
    }

  
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
            
    }
}}
