import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número de 1 a 7 para descobrir o dia da semana");
        dia = input.nextInt();
        if(dia==1){
            System.out.println("Domingo");
        }else if(dia==2){
            System.out.println("Segunda-feira");
        }else if(dia==3){
            System.out.println("Terça-feira");
        }else if(dia==4){
            System.out.println("Quarta-feira");
        }else if(dia==5){
            System.out.println("Quinta-feira");
        }else if(dia==6){
            System.out.println("Sexta-feira");
        }else if(dia==7){
            System.out.println("Sabado");
        }else{
            System.out.println("Não existe dia da semana com esse número");
        }
    }
}