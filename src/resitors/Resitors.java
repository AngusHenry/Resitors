/*
 * Angus Henry
 * Resitors.java
 * 06/03/2019
 * This program determines the value of resitors based on their colour.
 */

package resitors;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class Resitors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String  colours[] = new String[10];
       colours[0] = "black";
       colours[1] = "Brown";
       colours[2] = "Red";
       colours[3] = "Orange";
       colours[4] = "Yellow";
       colours[5] = "Green";
       colours[6] = "Blue";
       colours[7] = "Violet";
       colours[8] = "Grey";
       colours[9] = "White";
        String colour;
        colour= JOptionPane.showInputDialog("What is your resitor colour?.\n" 
                + "Seperate each colour by Hyphens.\n"
                + "Example: Red-Orange-Black");
        System.out.println (colour);
        for (int i = 0; i < colour.length();){
            int end = i-1;
            if (end == -1){
                System.out.println ("oops");
            }
        }
    }
    
}
