public class Ticket {

    private int ID;

    public int getID() {
        return ID;
    }

    public boolean setID(int ID) {
        if (ID>=0)
        {
             ID++;
        this.ID = ID;
        return true;
        }
        else 
             return false ;
                    
                
       
    }
public Time Get_Time () throws Exception { 
    return Movie.timeOfPlay;
}
    
    private int Hall_ID;
}
