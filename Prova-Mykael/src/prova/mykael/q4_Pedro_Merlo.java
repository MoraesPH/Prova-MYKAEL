
package prova.mykael;

import java.io.DataInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class q4_Pedro_Merlo {
    
    public static void main(String[] args) throws IOException {
        int n1, ant, suc;
        String s;
        DataInputStream dado;
        
        s = JOptionPane.showInputDialog("Digite um numero: ");
        dado = new DataInputStream(System.in);
        n1 = Integer.parseInt(s);
        
        ant = n1 - 1;
        suc = n1 + 1;
        
        JOptionPane.showMessageDialog(null,"o antecessor de "+n1+" = "+ant);
        JOptionPane.showMessageDialog(null,"o sucessor de "+n1+" = "+suc);
        
    }
}
