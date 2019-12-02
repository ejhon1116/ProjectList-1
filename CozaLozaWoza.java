import javax.swing.JOptionPane;
public class CozaLozaWoza
{
    public static void main(String[] args)
    {
        int yn = JOptionPane.showConfirmDialog(null, "This program will print all numbers from 1, to a number of your choosing. Numbers that \nare divisible by 3, 5 and 7 will be replaced with Coza, Loza and Woza, respectively. \n                             ~+~\nWould you like to use the program?", "CozaLozaWoza", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(yn == 0) 
        {
            
            String fin = "";
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "What number would you like to go up to?", "CozaLozaWoza", JOptionPane.QUESTION_MESSAGE));
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
            JOptionPane.showMessageDialog(null, "The output is: \n" + fin);
        }
    }
    
    public static String cozaLozaWoza(int n)
    {
        String y = "";
        if(n % 3 == 0) y = y + "Coza";
        if(n % 5 == 0) y = y + "Loza";
        if(n % 7 == 0) y = y + "Woza";
        return y;
    }
}
