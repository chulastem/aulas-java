import java.util.Scanner; 
public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double altura, peso;
    System.out.println("Qual o peso ideial para um Homem?");
    System.out.print("Digite a sua altura: ");
    altura = input.nextDouble();
    peso = 72.7*altura-58;
    System.out.println("O seu peso ideal é: "+peso+"kg");
}
} 
