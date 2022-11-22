import java.util.Scanner; 
public class Main{
public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); int a, b, c;
    System.out.print("Insira o valor de A: "); 
    a = input.nextInt();
    System.out.print("Insira o valor de B: "); 
    b = input.nextInt();
        
    c = a;
    a = b;
    b = c;
    
    System.out.println(" valor de A:"+a);
    System.out.println(" valor de B:"+b);
} 
}