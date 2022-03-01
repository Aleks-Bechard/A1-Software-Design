package week1;
/**
 * @author Matthew Beaudoin
 * Student Number: 991645801
 * 
 * This Class determines who the winner of the hand was. It takes in
 * who the player is betting on, how much they bet, the point value of
 * the players hand and the point value of the dealers hand. It then returns
 * a message telling the player the result of the hand, if they won or lost and
 * how much they either won or lost from the hand.
 */
public class Determine {
    
    //Holds the value of the dealerHand and the PlayerHand
    private int dealerHand;
    private int playerHand;
    
    //Holds the amount the player has bet
    private double betAmount;
    
    //Holds if the player bet for themselves, the dealer or a tie
    private String betChoice;
    //Holds the valid bet choices
    private static String[] betOp = {"Dealer","Player","Tie"};
    
    //Default constructor
    public Determine(){
        
        betChoice = "Dealer";
        betAmount = 1;
        playerHand = 0;
        dealerHand = 0;
    }
    
    //Constructor that requires who they are betting on, bet amount, value of player hand and value of dealer hand
    public Determine(String betChoi, double betAmou, int playHand, int dealHand){
        
        //Calls function to handle input validation
        setBetChoice(betChoi);
        //Calls function to handle input validation
        setBetAmount(betAmou);
        //Assumed valid so no validation used
        playerHand = playHand;
        dealerHand = dealHand;
    }
    
    //Sets and validates who the player is betting on
    public void setBetChoice(String betChoi)throws IllegalArgumentException{
        
        //Runs through the possible bet choices to validate
        for(int i = 0; i < 3; i++){
            //If the best choice is valid it sets and breaks the loop
            if(betChoi.equalsIgnoreCase(betOp[i])){
               betChoice = betChoi;
               break;
            }
            //If the choice isn't valid exception is thrown
            else if(i == 2){
                throw new IllegalArgumentException("Invalid Bet Choice. Must be Dealer, Player or Tie");
            }
        }
    }
    
    //Returns players choice for who they are betting on
    public String getBetChoice(){
        
        return betChoice;
    }
    
    //Sets how much the player is betting on this hand
    public void setBetAmount(double betAmou)throws IllegalArgumentException{
        
        //If the amount bet is 0 or less then exception is thrown
        if(betAmou <= 0){
            throw new IllegalArgumentException("Invalid Bet Quantity. Must be a number greater then zero");
        }
        //If the amount is greater then zero it is set
        else{
            betAmount = betAmou;
        }
    }
    
    //Returns how much the player is betting on this hand
    public double getBetAmount(){
        return betAmount;
    }
    
    //Sets the point value of the players hand
    public void setPlayerHand(int playHand){
        playerHand = playHand;
    }
    
    //sets the point value of the dealers hand
    public void setDealerHand(int dealHand){
        dealerHand = dealHand;
    }
    
    //Determines who won the hand or if it was a tie
    public double winner(){
        
        //enters if the hand was a tie
        if(playerHand == dealerHand){
            System.out.println("HAND WAS A TIE!");
            //Checks if the player bet for this option
            if(betChoice.equalsIgnoreCase("TIE")){
                //Returns 8:1 if they selected tie
                return win(8);
            }
            else{
                //Returns -bet if they did not bet tie
                return loss();
            }
        }
        
        //Enters if the dealer won the hand
        else if(playerHand < dealerHand){
            System.out.println("DEALER HAS THE BETTER HAND!");
            //Checks if the player bet for this option
            if(betChoice.equalsIgnoreCase("DEALER")){
               //Returns 0.95:1 if they selected Dealer
               return win(0.95);
            }
            else{
               //Returns -bet if they did not bet dealer
               return loss();
            }
        }
        
        //Enters if the player won the hand
        else{
            System.out.println("PLAYER HAS THE BETTER HAND!");
            //returns 2:1 if they selected player
            if(betChoice.equalsIgnoreCase("PLAYER")){
                return win(2);
            }
            //Returns -bet if they did not bet player
            else{
                return loss();
            }
        }
    }
    
    //Prints out you lost screen with losses
    public double loss(){
        System.out.println("YOU LOST!\nAMOUNT LOST: " + betAmount);
        return betAmount - betAmount*2;
    }
    
    //Prints out you win screen with winnings
    public double win(double winnings){
        System.out.println("YOU WIN\nAMOUNT WON: " + (betAmount * winnings));
        return betAmount * winnings;
    }
}
