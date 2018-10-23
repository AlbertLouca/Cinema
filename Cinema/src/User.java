
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

    private int ID;
    private static int count = 2 ;
public User ()
        {
            count++;
            this.ID = count;
        }
    public int getID() {
        return ID;
    }

   /* public boolean setID(int ID) {
        if (ID>=0)
        {
         this.ID = 
        return true;
        }
        return false;*/
    

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
    private String username;

    private String password;

  /*  public void setUsername() 
    {
    }

    public void setPassword() {
    } */

    public boolean Login(String username, String password) throws IOException
    {
     //   File myFile = new File ("D:/eTxt.txt");
        BufferedReader in = new BufferedReader(new FileReader("D:/eTxt.txt"));
        
String myString = in.readLine();
in.close();

     if (this.username==username && this.password==password)
     {
         return true;
     }
     else 
         return false;
    

}
}
