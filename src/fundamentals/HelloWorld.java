package fundamentals;

import javax.swing.JOptionPane;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("This is one way to say Hello, World!");
        JOptionPane.showMessageDialog(null, "This is another, but more in your face!" + "\nHello, World!");
        JOptionPane.showConfirmDialog(null, "Are you watching?");
    }
}