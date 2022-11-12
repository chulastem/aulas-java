// Programa que recebe um valor e retorna True se o valor for par e False se o valor for impar
// Utilizando o metodo boolean

package javaapplication14;
import java.util.Scanner;

public class JavaApplication14 {
    
    public static boolean parOuImpar(int n){
        if(n%2 == 0){
            System.out.println("O número é par");
            return true;
        }else{
            System.out.println("O número é impar");
            return false; 
        }
}

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n;
    
        System.out.println("Digite um número");
        n = input.nextInt();   
        System.out.println(parOuImpar(n));
    }
    
}

//Outro modo de fazer o metodo de uma forma mais simples

 public static boolean parOuImpar(int n){
       return n%2==0;

//Por conta do metodo ser boolean, se o valor for 0 é true e ser for 1 é false
