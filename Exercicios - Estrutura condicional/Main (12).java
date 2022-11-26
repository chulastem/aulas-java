import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2,m;
        System.out.println("Digite o primeiro valor:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextInt();
        System.out.println("Escolha o que fazer com os valores digitados");

        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Sair");

        m = input.nextInt();

        switch(m){
            case 1:
                System.out.println("Soma = "+(n1+n2));
                break;
            case 2:
                System.out.println("Subtração = "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplicação = "+(n1*n2));
                break;
            case 4:
                System.out.println("Divisão = "+(n1/n2));
                break;
            case 5:
                System.out.println("Fim do programa.");
        }
    }
}