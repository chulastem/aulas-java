import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        for(int i = 0; i<=4;i++){
            System.out.println("Digite um número");
            n =input.nextInt();
            System.out.println("dobro = "+n*2);
        }
    }
}
