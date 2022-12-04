import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double maior_nota = 0, menor_nota = 120;
        double nota[] = new double [5];
        for (int i=0; i < nota.length; i++){
            System.out.println("Digite a sua nota");
            nota[i] = entrada.nextDouble();
            if (nota[i] > maior_nota){
                maior_nota = nota[i];
            }
            if (nota[i] <= menor_nota){
                menor_nota = nota[i];
            }

        }
        System.out.println("A maior nota é: "+maior_nota);
        System.out.println("A menor nota é: "+menor_nota);
    }
}