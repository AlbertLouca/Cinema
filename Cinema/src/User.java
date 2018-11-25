package Users;
import static cinema.Cinema.UserLib;
import static cinema.Cinema.hash;
import java.io.*;
import java.util.ArrayList;

public class User implements Serializable {
        protected String username;

    protected String password;
//public ArrayList<String> UnToken(String Line){
//  //   String result[]=new String[50];
//     ArrayList<String> result=new ArrayList <String>(2);
//     String Word="";
//     int ctr=0;
//     for(int i=0;i<Line.length();i++){
//         if(Line.charAt(i)!='~'){
//             Word=Word+Line.charAt(i); 
//         }
//         else {
//             result.set(ctr,Word);
//             ctr++;
//             Word=new String();
//         }
//     }
//     return result;
//     
// }
    
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

//login using arraylist
//    public boolean Login(String username, String password)
//    {
//    
//   try {
////        User_Data se=new User_Data();
////        se.load();
//    
//       for(User d:UserLib){
//           if(d.getUsername().equals(username)&&d.getPassword().equals(password))
//               
//               return true;
//       }}
//       catch (Exception e){
//          
//             return false;  }
//                      
//       return false;
//    
//      
//    }
    public boolean Login(String username,String password){
        
        for(String x: hash.keySet()){
            if(username.equals(x)&&password.equals(hash.get(x)))
            return true;
            
        }
        return false;
        
        
    }
}
