public class Seat{
    private int ID;
    private char group;
    private boolean isAvailable;
    Seat(){
     ID=0;
     group=' ';
     isAvailable=true;
    }
        
        
         
    
public boolean setSeat(int ID , char group){
       if (isAvailable == false){
        
        return false;
        
    }

    
    if(group>='A'&&group<='Z'){
        this.group=group;
        
    }
    else{
        
        
      return false;
    }
    if (ID>=0 && ID<=100){
        this.ID=ID;


    }else {
        
        return false;
    }
    isAvailable=false;
    return true;
}

    public boolean reserve ()
{
    if(isAvailable)
    {
        isAvailable=false;
        return true;
    }
    else return false;
}

    
public boolean setSeat(boolean isAvailabe ,int userID)
{
        if(userID==1){
            this.isAvailable=isAvailable;
        }
    else if (isAvailable == false){
        
        return false;
        
    }
    

isAvailable=false;
return true;
}

    public boolean isIsAvailable() {
        return isAvailable;
    }

public int getID(){
    
    return ID;
}
public char getgroup(){
    
    return group;
}
}
