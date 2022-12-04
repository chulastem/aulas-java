import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso[] = new double[10];
        String sexo[] = new String[10];
        int peso_masc = 0, peso_fem = 0;


        for (int i = 0; i <= 9; i++) {
            System.out.println("Digite M para sexo Masculino e F para sexo feminino:");
            sexo[i] = entrada.next();
            System.out.println("Digite seu peso:");
            peso[i] = entrada.nextDouble();

            if ((sexo[i].equals("M")) && (peso[i] >= 60 && peso[i] <= 80)) {
                peso_masc = peso_masc + 1;
            }
            if ((sexo[i].equals("F")) && (peso[i] >= 50 && peso[i] <= 70)) {
                peso_fem = peso_fem + 1;
            }
        }
        System.out.println(peso_masc + " homens possuem o peso entre 60 e 80 kg");
        System.out.println(peso_fem + " mulheres possuem o peso entre 50 e 70 kg");
    }
}