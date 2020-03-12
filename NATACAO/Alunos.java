
package POO.NATACAO;

import java.util.ArrayList;
import java.util.Scanner;



public class Alunos {
    
    
    String nome;
    String sexo;
    int idade;
    float altura;
    float peso;
    float pesoIdeal;
    int r;
    
 
    void cadastro(){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        
        nome=scn.nextLine();
        
        System.out.println("Qual seu sexo? (M ou F)");
        
        sexo = scn.nextLine();
        
         System.out.println("Qual sua altura?");
        
        altura=scn.nextFloat();
        
        System.out.println("Qual sua idade?");
        
        idade=scn.nextInt();
        
        System.out.println("Qual seu peso?");
        
        peso=scn.nextFloat();
               
        
        Inicio();
        
        
    
}
    
    void ChecarSexo(){
        
        Scanner scn = new Scanner(System.in);

        
        if(sexo.equalsIgnoreCase("M")){
            
            ContaM();
            
        }
        
        else if(sexo.equalsIgnoreCase("F")){
            
            ContaF();
            
        }
        
        else{
            ChecarSexo();
        }
        
    }
    void ContaM(){
       
       Scanner scn = new Scanner(System.in);
       
        
        //( 72.7 * altura ) – 58
        
        pesoIdeal = (float) ((72.7 * altura) - 58);
        
            System.out.println("Seu peso ideal é "+pesoIdeal);
       
       
       Inicio();
   }
    void ContaF(){
       
       
       Scanner scn = new Scanner(System.in);
       
        
        // ( 62.1 * altura ) – 44.7
        
        pesoIdeal = (float) ((62.1 * altura) - 44.7);
        
            System.out.println("Seu peso ideal é "+pesoIdeal);
       
       
       Inicio();
   
       
       
   }
    
    void Inicio(){
                
        Scanner scn = new Scanner(System.in);
        
        System.out.println("[1] - Cadastro\n\n[2] - Checar Peso Ideal");

        r = scn.nextInt();
        
        
        switch(r){
            
            case 1:
        cadastro();
        
            case 2:
                
                ChecarSexo();
        
    }
}
}
