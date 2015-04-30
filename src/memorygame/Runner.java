/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;
import java.util.Scanner;
/**
 *
 * @author lucy.wei
 */
public class Runner {
    public static void main(String str[]) {
        Scanner scan= new Scanner(System.in);
        CardTable set = new CardTable(2,2);
        System.out.println(set);
        while(true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            set.flipCard(x, y);
            System.out.println(set);
            if (set.checkWin()) {
                System.out.println("Yay! You win.");
                break;
            }
        }
        
    }
}
