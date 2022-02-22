package Assignments.A1;
import java.util.Random;
/**
 * Aleks Bechard
 student number: 991645799
 */

/*
this class generates three cards for the player at random
*/
public class Player
{

   protected int score;
   protected Suits suit;

   public void createPlayerHand ()
   {
      Random random = new Random();

      for (int i = 0; i < 3; i++) {
         System.out.print(Value.values()[random.nextInt(Value.values().length)]);
         System.out.println(" " + Suits.values()[random.nextInt(Suits.values().length)]);
      }
   }

   public void setScore (int score) throws Exception
   {
      if (score < 0) {
         throw new Exception("Score must be greater that 0");
      }
      this.score = score;
   }

   public int getScore ()
   {
      return score;
   }

   public Suits getSuit ()
   {
      return suit;
   }


}
