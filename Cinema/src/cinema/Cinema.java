
package cinema;
import java.util.Scanner;

public class Cinema {
    boolean Exit=false;
     Scanner read=new Scanner(System.in);
 
  
public void PrintLogin(){   
   
    System.out.println("Username: ");
    String Take_Username=read.next();
    System.out.println("Password: ");
    String Take_Password=read.next();
    
    
    
} //na2ess el files
public void PrintHeader(){
    
System.out.println("|--------------------------------------------|");
System.out.println("|---------------Welcome to ------------------|");
System.out.println("|-----------our Cinema System----------------|");
System.out.println("|--------------------------------------------|");
        } //welcome
public int getinput(int NumChoices){
    int choice=-1;
    while(choice<0||choice>NumChoices){
        try{
            System.out.print("please enter a valid number\n");
            System.out.print("enter your choice: ");
            choice=Integer.parseInt(read.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("invalid selection please enter a valid one");
        }
        
    }
    return choice;
    
    
    
    
}  // ya5od kam choice fl switch 
    public static void main(String[] args) {
        Cinema Menu=new Cinema();
    Menu.PrintHeader();
    while(!Menu.Exit){
                     System.out.println("1) Login ");
                     System.out.println("2) Register ");
                     System.out.println("0)"+ConsoleColors.RED +" Exit "+ConsoleColors.RESET);
                     int choice=Menu.getinput(2);
     switch(choice){
        case 0:
                
            Menu.Exit=true;
              System.out.println("Thanks for using our System");
              break;
        case 1:
            Menu.PrintLogin();//if cond 3la 7assab howa eh
       
        break;
                
        case 2: 
             Scanner read=new Scanner(System.in);
            System.out.println("New Username: ");
            String NUsername=read.next();
             System.out.println("New Password: ");
             String NPassword=read.next();
             
            
            break;
        default:  System.out.println("sorry but wrong entry ");
          }
            }
             }      
}
