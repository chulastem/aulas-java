import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        float c, f;
        System.out.println("Digite a tempertura em Celsius: ");
        c = input.nextFloat();
        f = (float)((c*1.8)+32);
        System.out.println("A temperatura em Fahrenheit é: "+f+"F");
    }
    }
}