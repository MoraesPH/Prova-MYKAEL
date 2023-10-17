
package prova.mykael;


import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class q9_Pedro_Merlo {
    
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String nome, s, categoria = null;
        float peso;
        
        FileWriter arq = new FileWriter("C:\\USERS\\pmerlo\\desktop\\relatorio.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        System.out.println("Digite o nome do lutador: ");
        dado = new DataInputStream(System.in);
        nome = dado.readLine();
        
        System.out.println("Digite o peso do lutador "+nome+" :");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        peso = Float.parseFloat(s);
        
        if(peso < 65){
            categoria = "Pena";
        }else if(peso >= 65 && peso < 72){
            categoria = "Leve";
        }else if(peso >= 72 && peso < 79){
            categoria = "Ligeiro";
        }else if(peso >= 79 && peso < 86){
            categoria = "Meio Medio";
        }else if(peso >= 86 && peso < 93){
            categoria = "Medio";
        }else if(peso >= 93 && peso < 100){
            categoria = "Meio Pesado";
        }else if(peso >= 100){
            categoria = "Pesado";
        }
        
        System.out.println("Nome Fornecido: "+nome);
        System.out.println("Peso Informado: "+peso);
        
        gravarArq.println("O lutador "+nome+" pesa "+peso+"Kg e se encontra na categoria "+categoria);
        arq.close();
        
        
        
  

    }
}
