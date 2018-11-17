public class Payment extends Movie  {

    protected int payment_ID;
int price = 20 ;
    public int CalcPrice(Movie mov, Time tim, char seatgroup) {
        if (mov.isIs3D() == true )
        {
            price = price + 25;
        }
        else
        {  
           price = price;
        }
        
         if (tim.getHour()==6 || tim.getHour()==9  ) 
         {
          price += 25 ;
         } 
         else if (tim.getHour()==12)
         {
             price += 25 ;
         }
         else 
         {
             price = price;
         } 
         if (seatgroup == 'A' || seatgroup == 'B' || seatgroup == 'C' )
         {
             price += 15;
         }
         if( seatgroup == 'D' || seatgroup == 'E' || seatgroup == 'F' ||  seatgroup == 'G' )
         {
             price += 25 ;
         }
         else  
         {
             price += 5 ;
         }
          //   throw new UnsupportedOperationException("Not supported yet.");
    return price;    
    }
    }

