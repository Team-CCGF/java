 import javax.swing.JOptionPane;
public class Hello2 
{
   public static void main(String[] args) 
   {
   String x = "Hello ";
   String y = "world";
   String n;
   String r ="";
   Integer o;
   Integer p = 10;
   Integer a;
    JOptionPane.showMessageDialog(null,x+y);
 n = JOptionPane.showInputDialog( "whats your Name? ");   
 JOptionPane.showMessageDialog(null,x+n);
r  = JOptionPane.showInputDialog( "what's your favorite integer? ");
o =Integer.parseInt(r);
 a=o+p;
 JOptionPane.showMessageDialog(null,"I added ten to your integer:\n"+a);
   }  
   }