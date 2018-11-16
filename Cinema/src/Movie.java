public class Movie {

    private final int capacity=20;
    
    private int ID;

    private String name;

    private boolean is3D;

    private Time timeOfPlay;
    
    //private static int movieCounter=0;
    
    private boolean nowPlaying;

    public boolean setMovieDetails(String name,int ID,boolean is3D,Time timeOfPlay)
    {
        if(name.length()>1&&name.length()<100)
        {
            this.name=name;
        }
        else
        {
            return false;
        }
        
        if(timeOfPlay.getHour()<23&&timeOfPlay.getHour()>=0&&timeOfPlay.getMin()>=0&&timeOfPlay.getMin()<59)
        {
            this.timeOfPlay=timeOfPlay;
        }
        else{
            return false;
        }
        
            this.is3D=is3D;
            
            if(ID>0&&ID<capacity)
            {
                this.ID=ID;
            }
            else{
                return false;
            }
        return true;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public void setTimeOfPlay(int hour,int min) {
        this.timeOfPlay.setTime(hour, min);
    }

    public void setNowPlaying(boolean nowPlaying) {
        this.nowPlaying = nowPlaying;
    }
    Movie()
    {
        
        
            nowPlaying=false;
            ID=-1;
           
            name="NULL";
        is3D=false;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public Time getTimeOfPlay() {
        return timeOfPlay;
    }

    public boolean isNowPlaying() {
        return nowPlaying;
    }
}
