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
            int x = (int) Float.parseFloat(JOptionPane.showInputDialog(null, "What number would you like to go up to?", "CozaLozaWoza", JOptionPane.QUESTION_MESSAGE));
             
            //displays the output to the user
            if(x >= 1) 
            {
              System.out.println(cozaLozaWoza(x));
              JOptionPane.showMessageDialog(null, "The output is: \n" + cozaLozaWoza(x), "CozaLozaWoza", JOptionPane.INFORMATION_MESSAGE);
            }
              else JOptionPane.showMessageDialog(null, "Please chose an integer greater than 0", "CozaLozaWoza", JOptionPane.ERROR_MESSAGE); 
              //asks the user if they want to repeat using the program
              if(JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Coza Loza Woza", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
            }
        }
     
    public static String cozaLozaWoza(int n)
    {
      String fin = "";
        //determines what to replace the number with
        for(int i = 1; i <= n; i ++)
        {
            String y = "";
            if(i % 3 == 0) y = y + "Coza";
            if(i % 5 == 0) y = y + "Loza";
            if(i % 7 == 0) y = y + "Woza";
            if(i == n && (i % 3 == 0 || i % 5 == 0|| i % 7 == 0)) fin = fin + y;
            else if(i != n && (i % 3 == 0 || i % 5 == 0|| i % 7 == 0)) fin = fin + y + " ";
            if(i == n && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) fin = fin + i;
            else if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0) fin = fin + i + " ";
            if(i % 11 == 0) fin = fin + "\n";
        }
        return fin;
    }
}
