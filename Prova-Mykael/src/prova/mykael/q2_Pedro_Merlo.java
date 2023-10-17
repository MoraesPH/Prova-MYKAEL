package prova.mykael;

import java.io.DataInputStream;
import java.io.IOException;

public class q2_Pedro_Merlo {

    
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int anos, meses, dias, total;
        
        System.out.println("Digite sua idade(anos): ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        anos = Integer.parseInt(s);
        
        System.out.println("Digite sua idade(meses): ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        meses = Integer.parseInt(s);
        
        System.out.println("Digite sua idade(dias): ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        dias = Integer.parseInt(s);
        
        anos = anos * 365;
        
        meses = meses * 30;
       
        total = dias + anos + meses;
        System.out.println("Sua idade em dias e de: "+total+" dias");
        
    }
    
}
