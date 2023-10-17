
package prova.mykael;

import java.io.DataInputStream;
import java.io.IOException;


public class q5_Pedro_Merlo {
    
     public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int cod_armz = 1234, senha_armz = 9999, cod_usu, senha_usu;
        
         System.out.println("Digite o codigo de usuario: ");
         dado = new DataInputStream(System.in);
         s = dado.readLine();
         cod_usu = Integer.parseInt(s);
         
         if(cod_usu != cod_armz){
             System.out.println("Usuario Invalido");
         }else{
            System.out.println("Digite a senha: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            senha_usu = Integer.parseInt(s);
                if(senha_usu != senha_armz){
                    System.out.println("Senha Incorreta");
                }else{
                    System.out.println("Acesso Permitido");
                } 
         }
     }
     
     
}
