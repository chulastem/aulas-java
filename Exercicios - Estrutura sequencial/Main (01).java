import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
        System.out.println("Digite um valor:");
        n1 = input.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = input.nextInt();
        System.out.println("Digite outro valor: ");
        n3 = input.nextInt();
        System.out.println("A média aritmética dos valores é = "+(n1+n2+n3)/3);
    }  
}
