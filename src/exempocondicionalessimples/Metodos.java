/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempocondicionalessimples;

/**
 *
 * @author agarridogarcia
 */
public class Metodos {
    private int num1, num2;
    
    public Metodos (){
    }
        
    
    public Metodos (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void comparar (int n1, int n2){
        if(n1>n2)
            System.out.println(n1 + " é maior" );
        System.out.println("Adios");
    }
    public void compararDoble (int n1, int n2){
        if(n1>n2)
            System.out.println(n1 + " é maior");
        
        else
            System.out.println(n2 + " é maior");
        
        System.out.println("Adios");
    
    
    }
    public void compararAnidado(int n1, int n2){
        if(n1>n2)
            System.out.println(n1 + " é maior");
        else if (n1==n2)
            System.out.println(" Son iguais ");
        else 
            System.out.println(n2 + " é maior ");
        System.out.println("Adios");
    }
    public void comparaOperador (int n1, int n2){
        int maior = (n1>n2)? n1:n2;
        System.out.println("o maior é " + maior);
    }
}

    
