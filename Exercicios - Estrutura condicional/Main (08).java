import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do Nadador:");
        idade = input.nextInt();
        if(idade<=7){
            System.out.println("Idade: "+idade+" Categoria: INFANTIL");
        }else if(idade>8&&idade<=10) {
            System.out.println("Idade: "+idade+" Categoria: JUVENIL");
        }else if(idade>10&&idade<=15){
            System.out.println("Idade: "+idade+" Categoria: ADOLESCENTE");
        }else if(idade>15&&idade<=30){
            System.out.println("Idade: "+idade+" Categoria: ADULTO");
        }else if(idade>30){
            System.out.println("Idade: "+idade+" Categoria: SENIOR");
        }
    }
}