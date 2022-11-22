import java.util.Scanner;
public class Main { 
 
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
        float salMin, sal;
        System.out.println("Digite o salário mínimo atual:");
        salMin = input.nextFloat();
        System.out.println("Digite o seu salário atual:");
        sal = input.nextFloat();
        System.out.println("Você recebe "+sal/salMin+" Salários minimos");
    }
    }
}    
