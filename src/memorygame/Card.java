/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author lucy.wei
 */
public class Card {
    String symbol;
    boolean isUp;
    boolean isMatched;
    
    public Card(String s) {
        symbol = s;
        isUp = false;
        isMatched = false;
    }
    public String toString() {
        if (!isMatched && isUp) {
            return symbol;
        } else if (isMatched) {
            return "o";
        }
        return "x";
    }
    public void flip() {
        if (!isMatched){
            if (isUp) {
                isUp = false;
            } else {
                isUp = true;
            }
        }
    }
}
