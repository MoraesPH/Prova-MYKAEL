package prova.mykael;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class q8_Pedro_Merlo {
    
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int x, total;
        FileWriter arq = new FileWriter("C:\\USERS\\pmerlo\\desktop\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        System.out.println("Digite um valor: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        x = Integer.parseInt(s);
        gravarArq.println("Tabuada de "+x);
        
        for (int i = 1; i <= 10; i++){
            total = x * i; 
            System.out.println(x+" X "+i+" = "+total);
            gravarArq.println(x+" X "+i+" = "+total);
        }
        arq.close();
        
    }
}
