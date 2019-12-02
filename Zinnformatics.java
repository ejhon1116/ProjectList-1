import javax.swing.JOptionPane;
public class Zinnformatics
{
    public static void main(String[] args)
    {
        String comp = JOptionPane.showInputDialog(null, "This program will allow you to place an order at Zinnformatics.\nPlease enter your company name.", "Zinnformatics", JOptionPane.QUESTION_MESSAGE);
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of products you would like to buy.", "Zinnformatics", JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null, "Thank you for your order " +  comp + "! You have order " + quantity + " packages at a " + discount(quantity) * 100 + "% discount. Your final cost will be " + zinnformatics(quantity) * discount(quantity) + ".", "Zinnformatics", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int zinnformatics(int quantity)
    {
        return quantity * 99;
    }
    
    public static double discount(int quantity)
    {
        if(quantity > 99) return 0.5;
        else if(quantity > 49) return 0.4;
        else if(quantity > 49) return 0.4;
        else if(quantity > 9) return 0.2;
        return 0.0;
    }
}
