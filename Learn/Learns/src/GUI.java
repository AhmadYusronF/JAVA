

import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name"); // show input dialog
        JOptionPane.showMessageDialog(null, "Hellow " + name); // show message dialog

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age")); 
        JOptionPane.showMessageDialog(null, "Your Age are " + age + " Years Old");
        
    }
}
