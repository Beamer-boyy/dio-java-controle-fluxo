package desafioContador; 

import java.util.Scanner;

 
 

public class Contador {
    public static void main(String[] args) throws Exception {
         
        Scanner terminal = new Scanner(System.in); 
        System.out.println("Digite um numero");
        int parametroUm = terminal.nextInt(); 
        System.out.println("Digite o segundo parametro");
        int parametroDois = terminal.nextInt(); 

        terminal.close();
        
        try{
            
            contar(parametroUm, parametroDois);  

        }catch(ParametrosInvalidosException e){
               System.out.println(e.getMessage());
        }

    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }else {
            for(int i = parametroUm; i <= parametroDois; i++ ){
                System.out.println("imprimindo numero: " + i);
            }
        }
    }    
}
