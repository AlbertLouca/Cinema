
import java.io.*;


import java.util.logging.Level;
import java.util.logging.Logger;


public class User_Data extends User implements IFile  {
    
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
 
    int s = 1 ;
 User [] ArrayOfusers=new User [s];

@Override
         public boolean load()
    { try{
         File myFile = new File ("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users.txt");
        BufferedReader in= new BufferedReader(new FileReader("C:\\Users\\ Chadi N. Louca\\Documents\\Cinema\\Users.txt"));
        
            String myString;
            
             while((myString= in.readLine())!= null){
               int i=0;
                String []x=UnToken(myString);
                ArrayOfusers[i].username=x[i];
                 ArrayOfusers[i].password=x[i+1];
                i= i+2;
              in.close();
        return true;}}
        catch (FileNotFoundException ex) {
            Logger.getLogger(User_Data.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(User_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
return false;
    }

@Override
    public boolean save()
    {
        
        File myFile = new File ("C:\\ Chadi N. Louca\\Documents\\Cinema\\Users.txt"); 
        try {
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\ Chadi N. Louca\\Documents\\Cinema\\Users.txt"));
        int i=0;
       while(i<s){
            out.write( ArrayOfusers[i].username+"~"+ArrayOfusers[i].password+"~"+ArrayOfusers[i].ID+"~");
            i++;
        }out.close();
        return true;}
        catch (IOException ex) 
        {
            Logger.getLogger(User_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;}

    private String Untoken(String myString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
