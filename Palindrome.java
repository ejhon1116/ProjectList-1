import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
public class Palindrome
{
    public static void main(String[] args)
    {
        int rep = 1;
            int yn = JOptionPane.showConfirmDialog(null, "This is a program is a palindrome tester. Would you like to use it?", "Palindrome", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            while(yn == 0 && rep == 1)
            {
                rep --;
                String str = JOptionPane.showInputDialog(null, "Please input a string to be checked.", "Palindrome", JOptionPane.QUESTION_MESSAGE);
                if(isPalindrome(str) == true) JOptionPane.showMessageDialog(null, str + " is a palindrome!");
                else JOptionPane.showMessageDialog(null, str + " is not a palindrome!");
                if(JOptionPane.showConfirmDialog(null, "Would you like to reuse the program?", "Palindrome", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
            }
    }
    public static String reverseString(String str)
    {
        String rev = "";
        int length = str.length() - 1;
        for(int i = 0; i <= length; length -- ) rev = rev + str.charAt(length);
        return rev;
    }
    public static boolean isPalindrome(String str)
    {
        if(reverseString(str).equalsIgnoreCase(str)) return true;
        else return false;
    }
}
