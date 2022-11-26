import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite os números: ");
            x = input.nextInt();
            y = input.nextInt();
            z = x / y;
            System.out.println("Divisão: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero!!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dados incorreta!!");
        } catch (Exception e) {
            System.out.println("ERRO NÃO TRATADO!!");
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("FIM DO PROGRAMA!!");
    }
}