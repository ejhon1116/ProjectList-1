import javax.swing.JOptionPane;
public class MailingLabel 
{
  public static void main(String[] args)
  {
    int rep = 0;
    if(JOptionPane.showConfirmDialog(null, "This program will remove the delimeters in a mailing label. Would you like to use it?", "Mailing Label", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) rep = 1;
    while(rep > 0)
    {
      rep --;
      String str = JOptionPane.showInputDialog(null, "Please enter the string to be used.", "Mailing Label", JOptionPane.QUESTION_MESSAGE);
      String del = JOptionPane.showInputDialog(null, "Please input the string's delimeter.", "Mailing Label", JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(null, "The new string is:\n" + mailingLabel(str, del));
      if(JOptionPane.showConfirmDialog(null, "Would you like to use the program again?", "Mailing Label", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) rep = 1;
    }
  }
  public static String mailingLabel(String str, String del)
  {
    int i;
    String res = "";
    String[] arr = str.split(del);
    int length = arr.length - 1;
    int length2 = length;
    for(i = 0; i <= length && i != length2; i ++) res = res + arr[i] + "\n";
    if(i == length2) res = res + arr[i];
    return res;
  }
}
