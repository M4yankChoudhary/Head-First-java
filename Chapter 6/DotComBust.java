import java.util.*;

public class DotComBust {

     private GameHelper helper = new GameHelper();
     private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
     private int numOfGuesses = 0;
     
     
     private void setUpGame(){
     
     DotCom one = new DotCom();
     one.setName("Pets.com");
     
     DotCom two = new DotCom();
     two.setName("eToys.com");
     
     DotCom three = new DotCom();
     three.setName("Go2.com");
     
     dotComList.add(one);
     dotComList.add(two);
     dotComList.add(three);
     
     System.out.println("Your Goal is to sink Three Dot Coms.");
     System.out.println("Pets.com, eToys.com, Go2.com");
     System.out.println("Try to sink them all in fewest number of guesses");
     
     for(DotCom dotComToSet : dotComList){ 
        
        ArrayList<String> newLocation = helper.placeDotCom(3);
        dotComToSet.setLocationCells(newLocation);
        }
    }
     
     private void startPlaying(){
     
       while(!dotComList.isEmpty()){
       
       String userGuess = helper.getUserInput("Enter a guess");
       checkUserGuess(userGuess);
       }
       
       finishGame();
       }
     
     private void checkUserGuess(String userGuess){
     
     numOfGuesses++;
     String result = "miss";
     
     for(DotCom dotComToTest : dotComList){
        
        result = dotComToTest.checkYourself(userGuess);
        
        if(result.equals("hit")){
          break;
          
        }
        if(result.equals("kill")){
          
          dotComList.remove(dotComToTest);
          break;
         }
    }
       System.out.println(result);
  }     
     
     
     private void finishGame(){
       System.out.println("All dot coms are dead! your stock is now Worthless.");
       
       if(numOfGuesses <=18){
        
        System.out.println("It only Took You " + numOfGuesses + " guesses");
        System.out.println("you got out before your option snak.");
        
       } else{
        System.out.println("Took you enough." + numOfGuesses + " guesses");
        System.out.println("Fish are Dancing with your options");
        }
    }
       
     public static void main (String[] args){
     
         DotComBust game = new DotComBust();
                    game.setUpGame();
                    game.startPlaying();
     }
}
     
     
       
       
