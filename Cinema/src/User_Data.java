package Users;
import java.io.*;
import cinema.*;
import static cinema.Cinema.UserLib;
import java.util.*;
public class User_Data extends User implements IFile,Serializable  {
 

         public boolean load()
   {
       try
       {         
         ObjectInputStream Inp = new ObjectInputStream (new FileInputStream("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users Data.bin"));
         UserLib = (ArrayList<User>) Inp.readObject();
return true;
    } 
       catch (Exception e)
       {       
       return false;
   }
   }
    public boolean save()
    {
           try {
               ObjectOutputStream Out = new ObjectOutputStream (new FileOutputStream("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users Data.bin"));
                   Out.writeObject(UserLib);
                   Out.close();
              
                   return true;
           } catch (Exception e)
           {
               return false;
           }
    }
}
