package Users;
import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import java.io.*;
import java.util.ArrayList;

public class User implements Serializable {
        protected String username;

    protected String password;
protected Boolean isPowered;
    
   protected int ID;
   public void givePower(){
    isPowered=true;
    
    
}
   public Boolean getPower(){
       
       
       return isPowered;
   }
    private static int count = 2 ;
public User ()
        {
            isPowered=false;
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

    public boolean Login(String username,String password){
        
        for(String x: hash.keySet()){
            if(username.equals(x)&&password.equals(hash.get(x)))
            return true;
            
        }
        return false;
        
        
    }
}
