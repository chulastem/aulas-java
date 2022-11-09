import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t[] = new double[10];
        double media = 0, soma = 0, menorV = 0, maiorV = 0;
        int indexMaior = 0, indexMenor = 0;
        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o tempo da " + (i + 1) + "ª volta: ");
            t[i] = input.nextDouble();
            soma = soma + t[i];

            if (i == 0) {
                menorV = t[i];
                maiorV = t[i];
            }
            if (i > 0 && t[i] <= menorV) {
                menorV = t[i];
                indexMenor = i + 1;
            }
            if (i > 0 && t[i] > maiorV) {
                maiorV = t[i];
                indexMaior = i + 1;
            }

        }
        media = soma / t.length;
        System.out.println("\r\n");
        System.out.println("Tempo médio de todas as voltas: " + media + " segundos");
        System.out.print("volta nº " + indexMaior + " mais rapida com " + maiorV + " segundos -- ");
        System.out.println("volta nº " + indexMenor + " mais lenta com " + menorV + " segundos \n");

        for (int i = 0; i < t.length; i++) {
            if (t[i] < media) {
                indexMenor = i + 1;
                System.out.println("Volta nº" + indexMenor + " com " + t[i] + " segundos - abaixo da média");
            }
        }
        System.out.println("\n");
        for (int i = 0; i < t.length; i++) {
            if (t[i] > media) {
                indexMaior = i + 1;
                System.out.println("Volta nº" + indexMaior + " com " + t[i] + " segundos - acima da média");
                    }
                }
            }
        }

