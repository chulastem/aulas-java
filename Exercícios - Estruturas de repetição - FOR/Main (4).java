import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, soma=0, tMedia;
        for(int i = 0; i <=9;i++){
            System.out.println("Digite a temperatura do "+(i+1)+"º dia");
            t = input.nextDouble();
            soma = soma+t;
        }
        tMedia = soma/10;
        System.out.println("Temperatura média de todos os dias = "+tMedia+"Cº");
    }
}