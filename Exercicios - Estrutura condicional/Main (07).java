import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sal, aut;
        System.out.println("Digite o salário atual do funcionário");
        sal = input.nextDouble();
        if(sal < 1000.00){
            System.out.println("Funcionário tem direito ao aumento.");
            aut = (sal*30)/100;
            System.out.println("Novo salário = R$ "+(sal+aut));
        }else{
            System.out.println("Funcionário NÃO tem direito ao aumento");
        }
    }
}