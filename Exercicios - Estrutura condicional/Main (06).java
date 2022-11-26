import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, alt, imc;
        System.out.println("Digite seu peso:");
        peso = input.nextDouble();
        System.out.println("Digite sua altura");
        alt = input.nextDouble();
        imc = peso/(alt*alt);
        if(imc<20){
            System.out.println("IMC "+imc+": Abaixo do peso");
        }else{if(imc>=20&&imc<25){
            System.out.println("IMC "+imc+": Peso normal");
        }else {
            if (imc >= 25 && imc < 30) {
                System.out.println("IMC " + imc + ": Sobre peso");
            } else {
                if (imc >= 30 && imc < 40) {
                    System.out.println("IMC " + imc + ": Obeso");
                } else {
                    if (imc >= 40) {
                        System.out.println("IMC " + imc + ": Obeso Mórbido");
                        }
                    }
                }
            }   
        }   
    }
}