import java.util.Scanner;
public class Main { 
 
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
    int anoAt, anoNasc;
        System.out.println("Digite o seu ano de nascimento: ");
        anoNasc = input.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAt = input.nextInt();
        System.out.println("Sua idade é "+(anoAt-anoNasc)+" anos");
        System.out.println("Em 2050 a sua idade será "+(2050-anoNasc)+" anos"); 
        }
    }
}
