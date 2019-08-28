import java.util.*;
import java.io.*;
import java.util.concurrent.*;
/**
 * 
 *
 * Darnel Castor
 * 4/20/19
 * version 4.0
 */
public class diceGame2
{
Scanner keyboard = new Scanner(System.in);
    //variables
    public static double credits=10000 ;
    public static char choice;
    public static final int DIE_SIDE6= 6;
    public static double bet;
    public static int play ;
    
    public static void main(String[] args)throws Exception{
      //Prompt Menu
      printMenu();
        do{
            diceGame();
            
        }while(choice == 'y');
            
        
    }

     /*
           Method for menu
    */
    public static void printMenu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*********  Dice Game ************");
        System.out.println("Player credits: "+credits+" ");
        System.out.println("______________________________________");
        System.out.println("/          Rules of the Game         /");
        System.out.println("/          -----------------         /");
        System.out.println("/  1)It's you vs computer.           /");
        System.out.println("/  2)You play by rolling the dice.   /");
        System.out.println("/  3)you win, you earn what you bet  /");
         System.out.println("/  4)computer wins, you lose what you bet");
        System.out.println("/  5)if you ");
        System.out.println("______________________________________");
        System.out.println("Do you feel luck? Y/N ");

        //user input to continue game
        choice = keyboard.next().charAt(0); 
       
        if(credits > 0){
                do {
                        if(choice=='y' || choice=='Y'){
                              System.out.println(" how many times do you want to roll?");
                                play=keyboard.nextInt();
                                System.out.println(" how much do you want to bet: ");
                                bet=keyboard.nextDouble();
                                break;
                            }else if(choice=='n' || choice=='N'){
                                System.out.println("GAME OVER");
                                System.exit(0);
                            }else{
                                
                            
                                System.out.println("Invalid Choice");
                                    System.out.println("\n");
                                printMenu();
                                break;
                            }
                        }while(credits < 0);
        
        } else{
            System.out.println("you have no money to bet. come back when you have money to bet \nGoodbye! ");
            System.exit(0);
        }
    }
        
    
   

    /*
     * Method for game
       */
    public static void diceGame()throws Exception{   
    Scanner keyboard = new Scanner(System.in);
    //creating dice objects   
    Die die1 = new Die(6);
    Die die2 = new Die(6);

    int userScore=0;
    int compScore=0;

    //rolls dice 
        for(int i = 1; i <= play; i++){
        
        System.out.println("\nRoll #"+i);
        
        for(int j = 0; j < 1; j+=1){
                TimeUnit.SECONDS.sleep(1);  
            }
               die1.roll();
               int playerOne =die1.getValue();
               System.out.println("Player1 rolled: "+ playerOne );
            for(int j = 0; j < 1; j++){
              TimeUnit.SECONDS.sleep(2);  
            }
                
               die2.roll(); 
               int computer = die2.getValue();
               System.out.println("Computer rolled : "+ computer );
            for(int j = 0; j < 1; j+=1){
                TimeUnit.SECONDS.sleep(1);  
                }
            
                if (playerOne > computer){
                    userScore++;
                }
                if (computer > playerOne){
                    compScore++;
            }
        //displays scores
            System.out.print("\nplayer score: " + userScore);
            System.out.println("\tcomputer score: " + compScore );
            }
            
        //displays winner at end of game
        if(userScore > compScore){
            System.out.println(" Player Wins! you won : "+ bet);
            credits+= bet;
            System.out.println("Player credits: "+credits+" "); 
        }
        else if(compScore > userScore){
            System.out.println(" Computer Wins! you lost: " + bet);
            credits-=bet;
            System.out.println("Player credits: "+credits+" "); 
        }
        else{
            System.out.println(" Game tied... you haven't lost or won any money");
        }
        for(int n = 0; n < 1; n++){
           TimeUnit.SECONDS.sleep(2);
        }
