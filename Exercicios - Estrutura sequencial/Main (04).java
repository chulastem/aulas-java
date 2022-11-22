import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        float dMaior, dMenor;
        System.out.println("Para descobrir a AREA  de um losango, digite: ");
        System.out.println("Valor da DIAGONAL MAIOR: ");
        dMaior = input.nextFloat();
        System.out.println("Valor da DIAGONAL MENOR: ");
        dMenor = input.nextFloat();
        System.out.println("A AREA do losango é = "+(dMaior*dMenor)/2);
        
    }
    }
}
