import javax.swing.JOptionPane;
public class Palindrome
{
  public static void main(String[] args)
  {
    int rep;
    if(JOptionPane.showConfirmDialog(null, "This program checks if a string is a palindrome. Would you like to use it?", "Palindrome Checker", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) rep = 1;
    else rep = 0;
    while(rep > 0)
    {
      rep --;
      String str = JOptionPane.showInputDialog(null, "Please enter a string to be checked", "Palindrome Checker", JOptionPane.QUESTION_MESSAGE);
      if(isPalindrome(str) == true) JOptionPane.showMessageDialog(null, "Your string is a palindrome!", "Palindrome Checker", JOptionPane.INFORMATION_MESSAGE);
      else JOptionPane.showMessageDialog(null, "Your string is not a palindrome", "Palindrome Checker", JOptionPane.INFORMATION_MESSAGE);
      if(JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Palindrome Checker", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
      System.out.println(rep);
    }
  }
/////////////////////////////////////////////////////
  public static String reverseString(String str)
  {
    String res = "";
    for(int length = str.length() - 1; length >= 0; length --)
      res = res + str.charAt(length);
    return res;
  }
/////////////////////////////////////////////////////
  public static boolean isPalindrome(String str)
  {
    if(str.equalsIgnoreCase(reverseString(str))) return true;
    else return false;
  }
}
