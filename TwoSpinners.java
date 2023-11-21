public class TwoSpinners{
 	
 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    
            result = (int) (Math.random()*(max-min)) + min;
    	    return result;
 	}

 	
 	public void playRound()
 	{
   	    
        int player = spin(1,10);
        int computer = spin(2,8);
        if (player > computer){
            System.out.println("You win! " + (player - computer) + " points");
        }
        else if (computer > player){
            System.out.println("You lose. " + (player - computer) + " points");
        }
        else if (computer == player){
            player = spin(1,10);
            computer = spin(2,8);
            if (player > computer){
                System.out.println("You win! 1 points");
            }
            else if (computer > player){
                System.out.println("You lose. -1 points");
            }
            else if (computer == player){
                System.out.println("Tie. 0 points");
            }
        }
	}

 	public static void main(String[] args) {
     	  TwoSpinners ts = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){   
         		ts.playRound();

     	      }
 	  }

 }