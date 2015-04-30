package memorygame;
import java.util.ArrayList;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucy.wei
 */
public class CardTable {
    Card[][] myCards;
    String[] symbols = {"triangle", "square", "circle","octagon", "trapezoid", "rhombus", "happyface", "sadface",};
    int numUp;
    
    
    public CardTable (int rows, int cols){
        myCards = new Card[rows][cols];
        numUp = 0;
           for (int x = 0; x < (rows * cols)/2; x++) {
               for (int y = 0; y < 2; y++) {
                   int randomR = (int)(Math.random() * (myCards.length));
                    int randomC = (int)(Math.random() * (myCards[0].length));
                    if (myCards[randomR][randomC] == null) {
                        myCards[randomR][randomC] = new Card(symbols[x]);
                    }
                    else {
                        y--;
                    }
               }
           }
    }
    public ArrayList<Card> getAllUpCards() {
        ArrayList<Card> output = new ArrayList<Card>();
        for (int x = 0; x < myCards.length; x++) {
            for (int y = 0; y < myCards[0].length; y++) {
                if (myCards[x][y].isUp == true && myCards[x][y].isMatched == false) {
                    output.add(myCards[x][y]);
                }
            }
        }
        return output;
    }
    public ArrayList<Card> getAllMatchedCards() {
        ArrayList<Card> output = new ArrayList<Card>();
        for (int x = 0; x < myCards.length; x++) {
            for (int y = 0; y < myCards[0].length; y++) {
                if (myCards[x][y].isMatched == true) {
                    output.add(myCards[x][y]);
                }
            }
        }
        ArrayList<Card> upCards = getAllUpCards();
        if (upCards.get(0).symbol.equals(upCards.get(1).symbol)) {
            output.add(upCards.get(0));
            output.add(upCards.get(1));
        }
        return output;
    }
    public String toString() {
        String output = "";
        for (int x =0; x < myCards.length;x++) {
            for (int y = 0; y < myCards[0].length; y ++) {
                output += "\t" + myCards[x][y].toString() + "\t";
            }
            output += "\n";
        }
        return output;
    }
    public boolean flipCard(int r, int c) {
        boolean flag = false;
        if ( myCards[r][c].isMatched == false) {
            ArrayList<Card> upCards= getAllUpCards();
            if (numUp == 2) {
                if (upCards.get(0).symbol.equals(upCards.get(1).symbol)) {
                    upCards.get(0).isMatched = true;
                    upCards.get(1).isMatched = true;
                    flag = true;
                }
                upCards.get(0).flip();
                upCards.get(1).flip();
                upCards.clear();
                numUp = 0;
                
            }
            if (numUp < 2) {
                if (!myCards[r][c].isUp) {
                    myCards[r][c].flip();
                        numUp ++;
                        upCards.add(myCards[r][c]);
                }
                if (numUp == 2 && upCards.get(0).symbol.equals(upCards.get(1).symbol)) {
                    UserInterface u = new UserInterface();
                    u.setLabelText("You found a match!");
                    System.out.println("You found a match!");
                           
                }
            }
        } else {
            System.out.println("That card has already been flipped.");
        }
        return flag;
        
        
    }
        
    public boolean checkWin() {
        boolean winner = false;
        boolean flag = false;
        for (int x = 0; x < myCards.length; x++) {
            for (int y = 0; y < myCards[0].length; y++) {
                if (myCards[x][y].isUp == false) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            if (getAllMatchedCards().size() == (myCards.length * myCards[0].length)) {
                winner = true;
            }
        }
        return winner;
    }
    
    
}
