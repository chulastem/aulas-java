import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        double n;
        System.out.println("Digite um valor positivo:");
        n = input.nextDouble();
        System.out.println("O número digitado ao quadrado é = "+n*2);
        System.out.println("O número digitado ao cubo é = "+n*3);
        System.out.println("A raiz quadrada do número digitado é = "+n/2);
        System.out.println("A raiz cúbica do número digitado é = "+n/3);     
    }
    }
}