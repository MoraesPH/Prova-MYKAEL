/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova.mykael;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author pmerlo
 */
public class q3_Pedro_Merlo {
    
    
     public static void main(String[] args) throws IOException {
         DataInputStream dado;
         String s;
         boolean continuar = true;
         int opc, quantidade1 = 0, quantidade2 = 0, quantidade3 = 0;
         float soma1 = 0,soma2 = 0,soma3 = 0, total;
         
            while(continuar){
              System.out.println("Cafeteira");
              System.out.println("1-Cafe expresso");
              System.out.println("2-cafe capuccino");
              System.out.println("3-leite com cafe");
              System.out.println("4-totalizar vendas");
              System.out.println("Digite a opcao que deseja: ");

              dado = new DataInputStream(System.in);
              s = dado.readLine();
              opc = Integer.parseInt(s);

              if(opc == 1){
                  quantidade1 ++;
                  soma1 = (float) (soma1 + 0.75);
              }else if(opc == 2){
                  quantidade2 ++;
                  soma2 = (float) (soma2 +1.00); 
              }else if(opc == 3){
                  quantidade3 ++;
                  soma3 = (float) (soma3 + 1.25);
              }else if (opc == 4){
                  total = soma1 + soma2 + soma3;
                  System.out.println("total de cafe expresso vendido: "+quantidade1+"| total em reais: "+soma1);
                  System.out.println("total de cafe capuccino vendido: "+quantidade2+"| total em reais: "+soma2);
                  System.out.println("total de leite com cafe vendido: "+quantidade3+"| total em reais: "+soma3);
                  System.out.println("total em reais de todos os cafes vendidos: "+total);
                  break;
              }else{
                  System.out.println("Digite uma opcao valida");
                  
              }  
            }
     }
}
