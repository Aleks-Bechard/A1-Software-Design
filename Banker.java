package deliverable_3;
import java.util.Random;

/**
 * Nupur Patel
 */
public class Banker
{

   protected int score;
   protected Suits suit;
   protected Value values;

   public void createBankerHand ()
   {
      Random random = new Random();

      for (int i = 0; i < 2; i++) {
         System.out.print(Value.values()[random.nextInt(Value.values().length)]);
         System.out.println(" " + Suits.values()[random.nextInt(Suits.values().length)]);
      }
   }

   public void setScore (int score) throws Exception
   {
      if (score < 0) {
         throw new Exception("You need to enter the score greater than 0!!");
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

   public Value getValue ()
   {
      return values;
   }
}
