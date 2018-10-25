
//package cinema;
import java.io.*;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Scanner;

public class Cinema {
    boolean Exit=false;
     Scanner read=new Scanner(System.in);
     public int getinput(int NumChoices){
    int choice=-1;
    while(choice<0||choice>NumChoices){
        try{
           // System.out.print("please enter your \n");
            System.out.print("enter your choice: ");
            choice=Integer.parseInt(read.nextLine());
        }
        catch(NumberFormatException e){
            System.out.println("invalid selection please enter a valid one");
        }
        
    }
    return choice;
    
    
    
    
}  // ya5od kam choice fl switch 
 public String[] UnToken(String Line){
     String result[]=new String[20];
     String Word="";
     int ctr=0;
     for(int i=0;i<Line.length();i++){
         if(Line.charAt(i)!='~'){
             Word=Word+Line.charAt(i); 
         }
         else {
             result[ctr]=Word;
             ctr++;
             Word=new String();
         }
     }
     return result;
     
 }
public void PrintHeader(){
    
System.out.println("|--------------------------------------------|");
System.out.println("|---------------Welcome to ------------------|");
System.out.println("|-----------our Cinema System----------------|");
System.out.println("|--------------------------------------------|");
        } //welcome
    @SuppressWarnings("null")
 public static void main(String[] args) throws FileNotFoundException, IOException {
        Cinema Menu=new Cinema();
       User_Data UserData;
        UserData = new User_Data();
      
      
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
            System.out.println("Username: ");
            Scanner read=new Scanner(System.in);
    String Take_Username=read.next();
    System.out.println("Password: ");
    String Take_Password=read.next();
    User temp = new User();
    if(!temp.Login(Take_Username,Take_Password)){
            //------------------------------------------------
        System.out.println("incorrect username or password");
    return;}
    if(temp.getID()==1 ){     //  manager---------------------------------------------------------
       
       System.out.println("1)Set hall data");
       System.out.println("2)Set schedule");
       System.out.println("3)Set movie details");
       System.out.println("4)Set now playing movies");
       System.out.println("5)Set up coming movies");
       System.out.println("6) Update schedule");
       System.out.println("7)Add movie");
       System.out.println("8)Remove movie");
       System.out.println("9)Change username");
       System.out.println("10)Change password");
       System.out.println("11)Give power");
       System.out.println("0)Exit");
    choice=Menu.getinput(11);
    switch(choice){
        case 0: Menu.Exit=true;
        System.out.println("0 sha8al");
        break;
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        case 4:
            
            break;
        case 5:
            
            break;
        case 6:
            
            break;
        case 7:
            
            break;
        case 8:
            
            break;
        case 9:
            
            break;
        case 10:
            
            break;
        case 11:
            
            break;
                                                
    }
               
                //end of manager-------------------------------------------------------
                return;
    }//else if()
    //System.out.println("frouk eshta8al");
       
       
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        case 2:    //registration 1st---------------------------------------------------------------------------
             Scanner reads=new Scanner(System.in);
            System.out.println("New Username: ");
             String NUsername=reads.next();
             System.out.println("New Password: ");
             String NPassword=reads.next();
             BufferedReader in=new BufferedReader(new FileReader("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users.txt"));
             String search;
             while((search = in.readLine())!= null){
                 int i=0;
                 
                 String[] Untokened=Menu.UnToken(search);
                if(Untokened[i].equals(NUsername)) {
                     System.out.println("Username already taken");
                i++;return;}
             }in.close();
             
             BufferedWriter out=new BufferedWriter(new FileWriter("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\Users.txt",true));
             
             out.write(NUsername+"~"+NPassword+"~"+((UserData.s)+1)+"~");
            
//              UserData.ArrayOfusers[(UserData.s)-1].username=NUsername;
//              UserData.ArrayOfusers[(UserData.s)-1].password=NPassword;
               UserData.s++;
             out.close();
            System.out.println("Registration Succesfull");
            //menu 2
         
            break;
        
          //-------------------------  --------------------------------------------------------
        default:  System.out.println("sorry but wrong entry ");
    }
            }
             }   }   

