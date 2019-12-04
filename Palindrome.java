/* Palindrome.java | Author: Ethan Jhong *
 * Determines whether a user inputted    *
 * string is a palindrome                */
import javax.swing.JOptionPane;
public class Palindrome
{
  public static void main(String[] args)
  {
    int rep;
    
    //asks the user if they want to use the program
    if(JOptionPane.showConfirmDialog(null, "This program checks if a string is a palindrome. Would you like to use it?", "Palindrome Checker", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) rep = 1;
    else rep = 0;
    while(rep > 0)
    {
      rep --;
      
      //asks the user to input a string to be checked
      String str = JOptionPane.showInputDialog(null, "Please enter a string to be checked", "Palindrome Checker", JOptionPane.QUESTION_MESSAGE);
      
      //determines whether the string is or isnt a palindrome
      if(isPalindrome(str) == true) JOptionPane.showMessageDialog(null, "The reversed string is: " + reverseString(str) + ". It is the same as the original string: " + str + ". Therefore, your string is a palindrome!", "Palindrome Checker", JOptionPane.INFORMATION_MESSAGE);
      else JOptionPane.showMessageDialog(null, "The reversed string is: " + reverseString(str) + ". It is not the same as the original string: " + str + ". Therefore, your string is not a palindrome!", "Palindrome Checker", JOptionPane.INFORMATION_MESSAGE);
     
      //asks the user if they want to use the program again
      if(JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Palindrome Checker", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
    }
  }
  
  //reverses an inputted string
  public static String reverseString(String str)
  {
    String res = "";
    for(int length = str.length() - 1; length >= 0; length --) res = res + str.charAt(length);
    return res;
  }
  
  //determines whether a string is the same as it is when it is backwards
  public static boolean isPalindrome(String str)
  {
    if(str.equals(reverseString(str))) return true;
    else return false;
  }
}
