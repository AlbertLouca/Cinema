package cinema;
import GUI.AdminMenu;
import GUI.JLogin;
import GUI.JUser;
import GUI.MainMenu;
import Users.Movie_Data;
import Users.*;

//package cinema;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cinema {
   public static  HashMap <String,User> hash=new HashMap <String,User>();
    public static void savehash() throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\HashMap.bin"));
        oos.writeObject(hash);
        oos.close();
    }
public static void loadhash() throws FileNotFoundException, IOException, ClassNotFoundException{
    ObjectInputStream ois=new ObjectInputStream(new FileInputStream( "C:\\Users\\Chadi N. Louca\\Documents\\Cinema\\HashMap.bin"));
    hash=(HashMap<String,User>)ois.readObject();
    
    
    
}

    private static void Movie(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }     
   public static ArrayList<User> UserLib=new ArrayList<User>();
    
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
     String result[]=new String[50];
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
 public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
     
    // 
User_Data test=new User_Data();
test.load();
System.out.println("Users Data loaded Successfully");

Movie_Data test1=new Movie_Data();
test1.load();
System.out.println("Movie Data loaded Successfully");
MainMenu f=new MainMenu("Main Cinema");
f.setVisible(true);
//AdminMenu admin=new AdminMenu();
//admin.setVisible(true);
//JLogin log=new JLogin("Login Screen");
//log.setVisible(true);
//JUser frame=new JUser("Micho 3ala wd3o");  ///////////////////////////////////frame
//frame.setVisible(true);
     //  Cinema Menu=new Cinema();
       loadhash();
       //User_Data UserData;
      //  UserData = new User_Data();
     //   Movie_Data MovieData;
        Schedule Sch;
        Sch=new Schedule();
       // UserData.load();
        int MovieId=1;
//      Movie [] movi = new Movie[MovieId];
//      
//    Menu.PrintHeader();
//    while(!Menu.Exit){
//                     System.out.println("1) Login ");
//                     System.out.println("2) Register ");
//                     System.out.println("0)"+ConsoleColors.RED +" Exit "+ConsoleColors.RESET);
//                     int choice=Menu.getinput(2);
//     switch(choice){
//        case 0:
//                
//            Menu.Exit=true;
//              System.out.println("Thanks for using our System");
//             break;
//        case 1:
//            System.out.println("Username: ");
//            Scanner read=new Scanner(System.in);
//    String Take_Username=read.next();
//    System.out.println("Password: ");
//    String Take_Password=read.next();
//    User temp = new User();
//                     {
//                         try {
//                             if(!temp.Login(Take_Username,Take_Password)){
//                                 //------------------------------------------------
//                                 System.out.println("incorrect username or password");
//                                 break;
//                             }                   } catch (Exception ex) {
//                                   System.out.println("exception found ln main :114");
//                           //  Logger.getLogger(Cinema.class.getName()).log(Level.SEVERE, null, ex);
//                         }
//                     }
//    if("admin".equals(Take_Username)&&"password".equals(Take_Password) ){     //  manager---------------------------------------------------------
//       
//      // System.out.println("1)Set hall data");
//       System.out.println("1)Add movie"); 
//      // System.out.println("3)Set movie details");
//       System.out.println("2)Set now playing movies");
//       System.out.println("3)Set up coming movies");
//       System.out.println("4) Update schedule");
//       System.out.println("5)Set schedule");
//       System.out.println("6)Remove movie");
//       System.out.println("7)Change username");
//       System.out.println("8)Change password");
//       System.out.println("9)Give power");
//       System.out.println("0)Exit");
//    choice=Menu.getinput(11);
//    switch(choice){
//        case 0: Menu.Exit=true;
//        System.out.println("0 sha8al");
//        break;
//        case 1:
//            String temp1;
//            System.out.println("movie name: ");
//            
//            temp1=read.nextLine();
//          
//          movi[MovieId].setName(temp1);
//           System.out.println("is the movie 3d? (yes or no) ");
//              temp1=read.nextLine();
//              if(temp1=="yes"){
//                   movi[MovieId].setIs3D(true);}
//              else  {movi[MovieId].setIs3D(false);}
//              System.out.println("is it available for watch? (yes or no) ");
//              if(temp1=="yes"){
//                   movi[MovieId].setNowPlaying(true);}
//              else  {movi[MovieId].setNowPlaying(false);}
//              System.out.println("time of play.... hour: ");
//              int h=read.nextInt();
//              System.out.println("minutes: ");
//              int m=read.nextInt();
//              movi[MovieId].setTimeOfPlay(h, m);
//              MovieId++;
//            break;
//        case 2:
//            
//            break;
//        case 3:
//            
//            break;
//        case 4:
//            
//            break;
//        case 5:  //REDO this---------------------------------------------------
////Sch=new Schedule();
//Movie []Ofmovies=new Movie[10];
//String movii;
//Boolean x;
//int timeh;
//int timem;
//for(int i=0;i<10;i++){
//System.out.println("enter movie -> name->is3d?->time of play");
//movii=read.nextLine();
//x=read.nextBoolean();
//timeh=read.nextInt();
//timem=read.nextInt();
//Time timeOfPlay=new Time();
//timeOfPlay.setTime(timeh, timem);
//Ofmovies[i].setMovieDetails(movii, i, true, timeOfPlay);
//        }
//            break;
//        case 6:
//            
//            break;
//        case 7:
//            
//            break;
//        case 8:
//            
//            break;
//        case 9:
//            
//            break;
//        case 10:
//            
//            break;
//        
//                                                
//    }
//               
//                //end of manager-------------------------------------------------------}
//             break;  // return;
//    }else ////////////////////////eshta8al HENAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa
//        System.out.println("choose movie and time");
//   // System.out.println(("Movie: terminator Time: ")
//    ArrayList<Movie>  arrMov =new ArrayList<Movie>();
//    arrMov=Sch.getMovies();
//    try{
// for(Movie Micho:arrMov){
//      System.out.println(Micho.getName()+" " +Micho.getTimeOfPlay().getHour()+":" +Micho.getTimeOfPlay().getMin()+" ");
//      }
// String TakeMovieName;
// 
//    }catch(NullPointerException e){}
//   
//               
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        break;
//        case 2:    //registration 1st---------------------------------------------------------------------------
//             Scanner reads=new Scanner(System.in);
//            System.out.println("New Username: ");
//             String NUsername=reads.next();
//             System.out.println("New Password: ");
//             String NPassword=reads.next();
//             User_Data x=new User_Data();
//             Boolean taken=false;
//             for(User i:UserLib){
//                 if (i.getUsername()==NUsername){
//                     System.out.println("Username already taken");
//                     taken=true;
//                 }}
//             if(taken)
//                 break;
//             temp=new User();
//             temp.setUsername(NUsername);
//             temp.setPassword(NPassword);
//             UserLib.add(temp);
//             hash.put(NUsername, temp);
//             savehash();
//             x.save();
//                     System.out.println("Username registration successfull");
//                 
//             
//         
//            break;
//    
//          //-------------------------  --------------------------------------------------------
//        default:  System.out.println("sorry but wrong entry ");
//    }
//            }
             }   }   

