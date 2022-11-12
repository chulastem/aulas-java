import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int d, m, a;

        //Digitar data desejada
        System.out.println("Digite o dia:");
        d = input.nextInt();
        System.out.println("Digite o mês:");
        m = input.nextInt();
        System.out.println("Digite o ano:");
        a = input.nextInt();

        //Mostra a data padrão, já que não pediu para exibir nenhum valor digitado
            Data data = new Data();
            System.out.println(data.exibe());

        //Exibe a data digitada
            data.iniciaData(d, m, a);
            System.out.println(data.exibe());

        //Muda a data do dia para 54 (Valor invalido)
            data.setDia(54);
            System.out.println(data.exibe());

        //Muda o mes para 99 (Valor invalido)
            data.setMes(99);
            System.out.println(data.exibe());

        //Muda o ano para -1 (Valor invalido)
            data.setAno(-1);
            System.out.println(data.exibe());

    }
}