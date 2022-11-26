import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade para descobrir sua Classe Eleitoral:");
        idade = input.nextInt();
        if(idade<16){
            System.out.println("Não eleitor");
        }else if((idade>16&&idade<18)||(idade>65)){
            System.out.println("Eleitor facultativo");
        }else if(idade>18&&idade<65){
            System.out.println("Eleitor obrigatório");
        }
    }
}