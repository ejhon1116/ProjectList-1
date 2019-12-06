/* CozaLozaWoza.java | Author: Ethan Jhong *
 * This program prints all numbers up to   *
 * a user inputted number, replacing       *
 * multiples of 3, 5 and 7 with Coza, Loza *
 * and Woza, respectively.                 */
import javax.swing.JOptionPane;
public class CozaLozaWoza
{
    public static void main(String[] args)
    {
        int rep = 1;
        
        //asks the user if they want to use the program
        int yn = JOptionPane.showConfirmDialog(null, "This program will print all numbers from 1, to a number of your choosing. Numbers that \nare divisible by 3, 5 and 7 will be replaced with Coza, Loza and Woza, respectively. \n                             ~+~\nWould you like to use the program?", "CozaLozaWoza", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        while(yn == 0 && rep == 1) 
        {
            rep --;
            String fin = "";
            
            //asks the user for a number to go up to
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to go up to?", "CozaLozaWoza", JOptionPane.QUESTION_MESSAGE));
            
            //concatenates all the numbers from 1 to the user inputted number, running cozaLozaWoza when it runs into multiples of 3, 5 or 7
            for(int i = 1; i <= x; i ++)
            {
                if(i % 3 == 0 || i % 5 == 0 || i  % 7 == 0) 
                {
                    if(i == x) fin = fin + cozaLozaWoza(i);
                    else fin = fin + cozaLozaWoza(i) + " ";
                }
                else if(i == x) fin = fin + i;
                else fin = fin + i + " ";
                if(i % 11 == 0) fin = fin + "\n";
            }
            
            //displays the output to the user
            JOptionPane.showMessageDialog(null, "The output is: \n" + fin);
            
            //asks the user if they want to repeat usingthe program
            if(JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Coza Loza Woza", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
        }
    }
    
    public static String cozaLozaWoza(int n)
    {
      
        //determines what to replace the number with
        String y = "";
        if(n % 3 == 0) y = y + "Coza";
        if(n % 5 == 0) y = y + "Loza";
        if(n % 7 == 0) y = y + "Woza";
        return y;
    }
}
