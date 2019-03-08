/*
 * Angus Henry
 * Resitors.java
 * 06/03/2019
 * This program determines the value of resitors based on their colour.
 */

package resitors;

import java.util.ArrayList;
import java.util.Collections;
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
       ArrayList <String> chosenColour = new ArrayList();
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
        String colour, saved;
        String createdColour = "";
        String firstTwo = "";
        int powerTen;
        colour= JOptionPane.showInputDialog("What is your resitor colour?.\n" 
                + "Seperate each colour by Hyphens.\n"
                + "Example: Red-Orange-Black");
        System.out.println (colour);
        for (int i = 0; i < colour.length();){
            int end = i-1;
            if (end == -1){
            }
            else {
                if ("-".equals(colour.substring(end,i ))){
            Collections.addAll (chosenColour, createdColour);
            createdColour = "";
            }
                else {
                createdColour += colour.substring (i-1,i);   
                }
            System.out.println (createdColour); 
        }
            i++;
        }
        createdColour += colour.substring (colour.length()-1,colour.length() );
        Collections.addAll (chosenColour, createdColour);
                System.out.println (chosenColour);
                int a =0; 
        for (int i = 0; i < chosenColour.size();){
       
             for (int x = 0; x <= colours.length-1;){
                  saved = colours[x];
                  System.out.println ("i" + i);
                  System.out.println ("x" + x);
                  System.out.println (saved);
                  System.out.println (chosenColour.get(i));
                if (saved.equalsIgnoreCase(chosenColour.get(i)) && a <2){ 
                firstTwo += x; 
                a++;
                System.out.println ("firstTwo" + firstTwo); 
                System.out.println ("a" + a);
                x = colours.length +1;
            }   
                else if (a == 2 && saved.equalsIgnoreCase(chosenColour.get(i))) {
                 powerTen = x;   
                 System.out.println (" powe" +powerTen);
                }
                x++;
            }
            i++;
    }
        System.out.println ("You enterd:" +colour );
        System.out.println ("The value of the resitor is:" );
    }
    
}