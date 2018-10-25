public class Time{
    private int hour;
    private int min;
    Time(){
     hour =0;
     min=0;
        
        
}
    
    public boolean setTime(int hour , int min){
    if (hour>=0 && min>=0&& hour<=23 && min<=59){
        this.hour=hour;
    this.min=min;
    return true;
        
    }
    else{
   return false;
        
    }
    }
public int getHour(){
    
    return hour;
}
public int getMin(){
    
    return min;
}
}
