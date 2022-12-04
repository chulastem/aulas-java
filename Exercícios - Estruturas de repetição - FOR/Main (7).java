import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pessoa_gorda = 0;
        int idade[] = new int[7];
        double peso[] = new double[7];
        int somaIdade = 0;
        double mediaIdade = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite a sua idade: ");
            idade[i] = entrada.nextInt();
            System.out.println("Digite o seu peso: ");
            peso[i] = entrada.nextDouble();

            somaIdade = somaIdade + idade[i];

            if (peso[i] > 90) {
                pessoa_gorda = pessoa_gorda + 1;
            }
        }
        System.out.println("Nº pessoas com + de 90kg: " + pessoa_gorda);
        mediaIdade = somaIdade / idade.length;
        System.out.println("Média da idade: " + mediaIdade);
    }
}