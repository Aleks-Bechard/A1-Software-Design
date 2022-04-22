import static org.junit.Assert.*;
import org.junit.Test;

public class DetermineTest {
    
    // Tests Constructors
    @Test
    public void testEmptyConstructor(){
        Determine determine = new Determine();
        assertEquals(1, determine.getBetAmount(), 0.02);
        assertEquals("Dealer", determine.getBetChoice());
    }

    @Test
    public void testFullConstructor(){
        Determine determine = new Determine("Player", 120, 9, 9);
        assertEquals(120, determine.getBetAmount(), 0.02);
        assertEquals("Player", determine.getBetChoice());
    }

    //Tests setting betChoice and betAmount
    @Test 
    public void testSetBetChoice(){
        Determine determine = new Determine();
        determine.setBetChoice("Dealer");
        assertEquals("Dealer", determine.getBetChoice());
    }

    @Test
    public void testSetBetAmount(){
        Determine determine = new Determine();
        determine.setBetAmount(201);
        assertEquals(201, determine.getBetAmount(), 0.02);
    }

    //Tests win/loss where player bet on Tie
    @Test
    public void testTieWin(){
        Determine determine = new Determine("Tie", 100, 8, 8);
        assertEquals(800, determine.winner(), 0.02);
    }

    @Test
    public void testTieLoss(){
        Determine determine = new Determine("Tie", 100, 7, 8);
        assertEquals(-100, determine.winner(), 0.02);
    }

    //Tests win/loss where player bet on Dealer
    @Test
    public void testBankerWin(){
        Determine determine = new Determine("Dealer", 100, 7, 8);
        assertEquals(95, determine.winner(), 0.02);
    }

    @Test
    public void testBankerLoss(){
        Determine determine = new Determine("Dealer", 100, 8, 8);
        assertEquals(-100, determine.winner(), 0.02);
    }

    //TEsts win/loss where player bet on Player
    @Test
    public void testPlayerWin(){
        Determine determine = new Determine("Player", 100, 8, 7);
        assertEquals(200, determine.winner(), 0.02);
    } 

    @Test
    public void testPlayerLoss(){
        Determine determine = new Determine("Player", 100, 8, 8);
        assertEquals(-100, determine.winner(), 0.02);
    } 
}
