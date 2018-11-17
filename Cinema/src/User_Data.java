
import java.io.*;
import java.util.*;
public class User_Data extends User implements IFile  {
 private ArrayList<User> ArrayOfusers =new ArrayList<User>();

@Override
         public boolean load()
   {
       try
       {         
         ObjectInputStream Inp = new ObjectInputStream (new FileInputStream("C:\\Users\\PC\\Desktop\\Out.bin"));
         ArrayOfusers = (ArrayList<User>) Inp.readObject();
return true;
    } 
       catch (Exception e)
       {       
       return false;
   }
   }
@Override
    public boolean save()
    {
           try {
               ObjectOutputStream Out = new ObjectOutputStream (new FileOutputStream("C:\\Users\\PC\\Desktop\\Out.bin"));
                   Out.writeObject(ArrayOfusers);
                   Out.close();
                   return true;
           } catch (Exception e)
           {
               return false;
           }
    }
}
