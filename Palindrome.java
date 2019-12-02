import javax.swing.JOptionPane;
public class Palindrome
{
    public static void main(String[] args)
    {
        int rep = 1;
        while(rep > 0)
        {
            rep --;
            JOptionPane.showMessageDialog(null, "Input String", "dfsfisjisjfis");
            //if(isPalindrome(str) == true) JOptionPane.showMessageDialog(null, str + " is a palindrome!");
            //else JOptionPane.showMessageDialog(null, str + " is not a palindrome!");
            JOptionPane.showConfirmDialog(null, "Would you like to reuse the program");
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
