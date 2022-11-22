import java.util.Scanner;
public class Main { 
 
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        double dolar, valor;
        System.out.println("Digite a cotação atual do dolar em R$:");
        dolar = input.nextDouble();
        System.out.println("Digite o valor que pussui em Dolar $:");
        valor = input.nextDouble();
        System.out.println("Você pussuí R$ "+(valor*dolar)+" na cotação atual do dolar");
    }
    }
}
