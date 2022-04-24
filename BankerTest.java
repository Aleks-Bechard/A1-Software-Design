package deliverable_3;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author NUPUR
 */
public class BankerTest
{
   @Test
   public void testCreatePlayerHand ()
   {
      System.out.println("Create Player Hand");
      int hand = 3;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testCreatePlayerHand

   @Test
   public void testSetScore ()
   {
      System.out.println("Create Player Hand");
      int score = 1;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testSetScore

   @Test
   public void testCheckScoreGood ()
   {
      System.out.println("Check SCORE");
      int score = 10;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testCheckScoreGood

   @Test
   public void testCheckScoreBad ()
   {
      System.out.println("Check SCORE");
      int score = 0;
      boolean expResult = false;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testCheckScoreBad

   @Test
   public void testCheckScoreBoundary ()
   {
      System.out.println("Check SCORE");
      int score = 5;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testCheckScoreBoundary

   @Test
   public void testGetSuitGoodTest ()
   {
      System.out.println("Check GetSuit");
      int score = 5;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testGetSuitGoodTest

   @Test
   public void testGetSuitBadTest ()
   {
      System.out.println("Check GetSuit");
      int score = 5;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testGetSuitBadTest

   @Test
   public void testGetSuitBoundaryTest ()
   {
      System.out.println("Check GetSuit");
      int score = 5;
      boolean expResult = true;
      boolean result = Banker.checkScore(score);
      assertEquals(expResult, result);
      //fail("The test case is a prototype.");
   }//end of testGetSuitBoundaryTest

}//end of Banker_Test class
