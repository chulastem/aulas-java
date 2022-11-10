
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
        parOuImpar(n);
    }
    
}
