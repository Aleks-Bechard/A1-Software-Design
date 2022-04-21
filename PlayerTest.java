/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package deliverable_3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Aleks
 */
public class PlayerTest
{

   public PlayerTest ()
   {
   }

   /**
    * Test of createPlayerHand method, of class Player.
    */
   @Test
   public void testCreatePlayerHand ()
   {
      System.out.println("createPlayerHand");
      Player instance = new Player();
      instance.createPlayerHand();
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of setScore method, of class Player.
    */
   @Test
   public void testSetScore () throws Exception
   {
      System.out.println("setScore");
      int score = 0;
      Player instance = new Player();
      instance.setScore(score);
      // TODO review the generated test code and remove the default call to fail.
   }

   /**
    * Test of getScore method, of class Player.
    */
   @Test
   public void testGetScoreGoodTest ()
   {
      System.out.println("getScore good test");
      Player instance = new Player();
      int expResult = 0;
      int result = instance.getScore();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetScoreBadTest ()
   {
      System.out.println("getScore bad test");
      Player instance = new Player();
      int expResult = 2;
      int result = instance.getScore();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetScoreBoundry ()
   {
      System.out.println("getScore Boundrty test");
      Player instance = new Player();
      int expResult = 1;
      int result = instance.getScore();
      assertEquals(expResult, result);
   }

   /**
    * Test of getSuit method, of class Player.
    */
   @Test
   public void testGetSuitGoodTest ()
   {
      System.out.println("getSuit Good test");
      Player instance = new Player();
      Suits expResult = instance.getSuit();
      Suits result = instance.getSuit();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetSuitBadTest ()
   {
      System.out.println("getSuit Bad test");
      Player instance = new Player();
      String expResult = " ";
      Suits result = instance.getSuit();
      assertEquals(expResult, result);
   }

   @Test
   public void testGetSuitBoundryTest ()
   {
      System.out.println("getSuit Boundry test");
      Player instance = new Player();
      Suits expResult = instance.getSuit();
      Suits result = instance.getSuit();
      assertEquals(expResult, result);
   }

}
