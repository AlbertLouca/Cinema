public class Movie {

    private int ID;

    private String name;

    private boolean is3D;

    private Time timeOfPlay;

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
            
            if(ID>0)
            {
                this.ID=ID;
            }
        return true;
    }
    Movie()
    {
        ID=0;
        name="NULL";
        is3D=false;
    }
}
