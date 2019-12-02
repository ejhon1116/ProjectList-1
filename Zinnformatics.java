/* Zinnformatics.java | Author: Ethan Jhong  *
 * This program calculats the cost including *
 * discount of fictious company              */
import javax.swing.JOptionPane;
public class Zinnformatics
{
    public static void main(String[] args)
    {
        //asks the user for their company's name
        String comp = JOptionPane.showInputDialog(null, "This program will allow you to place an order at Zinnformatics.\nPlease enter your company name.", "Zinnformatics", JOptionPane.QUESTION_MESSAGE);
        
        //asks the user for the amount of packages they would like to buy 
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of packages you would like to buy.", "Zinnformatics", JOptionPane.QUESTION_MESSAGE));
        
        //displays the percentage discount and calculates their final total cost
        JOptionPane.showMessageDialog(null, "Thank you for your order " +  comp + "! You have order " + quantity + " packages at a " + discount(quantity) * 100 + "% discount. Your final cost will be $" + zinnformatics(quantity) * (1 - discount(quantity)) + "0.", "Zinnformatics", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int zinnformatics(int quantity)
    {
        //finds the total cost without discount
        return quantity * 99;
    }
    
    public static double discount(int quantity)
    {
        //determines the discount the customer will be getting
        if(quantity >= 100) return 0.5;
        else if(quantity >= 50) return 0.4;
        else if(quantity >= 20) return 0.3;
        else if(quantity >= 10) return 0.2;
        return 0.0;
    }
}
