import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Digite um número para mostrar sua tabuada");
        n = input.nextInt();
        for(int i=0; i <= 10; i++){
           m = n*i;
            System.out.println(n+" x "+i+" = "+m);
        }

    }
}