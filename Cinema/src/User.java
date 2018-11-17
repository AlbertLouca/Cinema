import java.io.*;
import java.util.ArrayList;

public class User {
        protected String username;

    protected String password;
public ArrayList<String> UnToken(String Line){
  //   String result[]=new String[50];
     ArrayList<String> result=new ArrayList <String>(2);
     String Word="";
     int ctr=0;
     for(int i=0;i<Line.length();i++){
         if(Line.charAt(i)!='~'){
             Word=Word+Line.charAt(i); 
         }
         else {
             result.set(ctr,Word);
             ctr++;
             Word=new String();
         }
     }
     return result;
     
 }
    
   protected int ID;
    private static int count = 2 ;
public User ()
        {
            
            this.ID = count;
            count++;
        }
    public int getID() {
        return ID;
    }

  
    

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username)
    {
        if (username.length()>1 && username.length()<100)
        {
            
        this.username = username;
    return true;
        }
        else
            return false; 
    }
    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password)
    {
        if (password.length()>1 && password.length()<100)
        {
        this.password = password;
    return true;
        }
else
            return false;
    }


    public boolean Login(String username, String password) throws IOException
    {
     // File myFile = new File ("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users.txt");
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users.txt"));   
            String myString ;
                    
int i = 0 ;
while((myString = in.readLine()) != null)
{
    
        
    ArrayList<String> text = UnToken(myString) ; // Array Of Strings
    for(int j=0;j<10;j++){
        //System.out.println(text[j]);
   
    if (text.get(i).equals(username) && text.get(i+1).equals(password))
           {
         return true;
     }
i+=2;} in.close(); }
         return false;
    
    }}
            
  
