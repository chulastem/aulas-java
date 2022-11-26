import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número de 1 a 12 para descobrir o Mês");
        dia = input.nextInt();
        if(dia==1){
            System.out.println("Janeiro");
        }else if(dia==2){
            System.out.println("Fevereiro");
        }else if(dia==3){
            System.out.println("Março");
        }else if(dia==4){
            System.out.println("Abril");
        }else if(dia==5){
            System.out.println("Maio");
        }else if(dia==6){
            System.out.println("Junho");
        }else if(dia==7) {
            System.out.println("Julho");
        }else if(dia==8){
            System.out.println("Agosto");
        }else if(dia==9){
            System.out.println("Setembro");
        }else if(dia==10){
            System.out.println("Outubro");
        }else if(dia==11){
            System.out.println("Novembro");
        }else if(dia==12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Não existe mês com esse número");
        }
    }
}