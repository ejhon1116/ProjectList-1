/* MailingLabel.java | Author: Ethan Jhong *
 * It removes a user chosen delimeter from 
 * a user inputted string                  */
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class MailingLabel {
  public static void main(String[] args) {
    int rep = 0;
    // asks the user if they want to use the program
    if (JOptionPane.showConfirmDialog(null,
        "This program will remove the delimeters in a mailing label. Would you like to use it?", "Mailing Label",
        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0)
      rep = 1;
    while (rep > 0) {
      rep--;

      // asks the user to input a string
      String str = JOptionPane.showInputDialog(null, "Please enter the delimeted string to be used.", "Mailing Label",
          JOptionPane.QUESTION_MESSAGE);

      // asks the user to input a delimeter
      String del = JOptionPane.showInputDialog(null, "Please input the string's delimeter.", "Mailing Label",
          JOptionPane.QUESTION_MESSAGE);

      // outputs the new string
      JOptionPane.showMessageDialog(null, "The new string is:\n--------------------------------\n"
          + mailingLabel(str, del) + "\n--------------------------------", "Mailing Label",
          JOptionPane.INFORMATION_MESSAGE);
      System.out.println("The new string is:\n--------------------------------\n" + mailingLabel(str, del)
          + "\n--------------------------------");

      // asks the user if they would like to use the program again
      if (JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Mailing Label",
          JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        rep = 1;
    }
  }

  public static String mailingLabel(String str, String del) {
    // replaces all of a user inputted delimeter with a new line
    return str.replaceAll(Pattern.quote(del), "\n");
  }
}
