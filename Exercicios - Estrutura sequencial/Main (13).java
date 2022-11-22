import java.util.Scanner; 
public class Main{
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double altura, peso;
        System.out.println("Qual o peso ideial para uma Mulher?"); 
        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();
        peso = 62.1* altura-44.7;
        System.out.println("O seu peso ideial é: "+peso+"Kg");
        }
} 