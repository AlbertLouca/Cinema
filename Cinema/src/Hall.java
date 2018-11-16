public class Hall {

    private final char capacityy='G';
    private final int capacityx=10;

    private Seat array_seats[][]=new Seat[capacityy][capacityx];

    private int ID;
    
    Schedule sch[];

    

    public Seat[][] getArray_seats() {
        return array_seats;
    }
    public Seat getseat(char group,int pos)
    {
        return array_seats[group][pos];
    }
    
    Hall() 
    {
        for(char i='A';i<=capacityy;i++)
        {
            for(int j=0;j<capacityx;j++)
            {
                array_seats[i][j].setSeat(j,i);                           //UNCOMMENT
            }
        }
    }

    public int getID() {
        return ID;
    }
    
    
    
}
