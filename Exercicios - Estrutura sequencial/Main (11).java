import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        int n;
        System.out.println("Digite um valor inteiro:");
        n = input.nextInt();
        System.out.println("Número antencessor ao valor digitado: "+(n-1));
        System.out.println("Nùmero sucessor ao valor digitado: "+(n+1));
        System.out.println("O dobro do número digitado: "+(n*2));
        System.out.println("A metade do número digitado: "+(n/2));
    }
    }
}
