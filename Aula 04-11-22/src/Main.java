import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta c = new Conta();
        c.inicializarConta(1000202);

        int opcao;
        double valor;
//Sistema de menu usando o do while
        do{
            System.out.println("1: DEPOSITAR");
            System.out.println("2: SACAR");
            System.out.println("3: MOSTRAR");
            System.out.println("4: SAIR");

            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    valor = input.nextDouble();
                    c.depositar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = input.nextDouble();
                    c.sacar(valor);
                    break;
                case 3:
                    c.exibirDados();
                    break;
                case 4:
                    System.out.println("FIM DO PROGRAMA!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (opcao != 4);


    }
}
