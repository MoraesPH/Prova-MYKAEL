package prova.mykael;

import java.io.DataInputStream;
import java.io.IOException;


public class q6_Pedro_Merlo {
    
     public static void main(String[] args) throws IOException {
         DataInputStream dado;
         String s, resp;
         int n, quantidade = 0, soma = 0;
         float media;
         
         do{
             System.out.println("digite um numero: ");
             dado = new DataInputStream(System.in);
             s = dado.readLine();
             n = Integer.parseInt(s);
             quantidade ++;
             soma = soma + n;
             System.out.println("Deseja escrever outro numero: ");
             dado = new DataInputStream(System.in);
             resp = dado.readLine();
             
         }while(resp.equals("s"));
         media = soma / quantidade;
         System.out.println("A soma dos valores digitados foram de: "+soma);
         System.out.println("A quantidade de valores digitados foram de: "+quantidade);
         System.out.println("A media dos valores foram de: "+media);
     }
}
