# Estruturas de Repetição - FOR


### 1 - Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. 

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        for(int i = 0; i<=4;i++){
            System.out.println("Digite um número");
            n =input.nextInt();
            System.out.println("dobro = "+n*2);
        }
    }
}
```

### 2 -Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado. 

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Digite um número");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
```

### 3 - Leia um número e imprima a tabuada de multiplicar deste número. 

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Digite um número para mostrar sua tabuada");
        n = input.nextInt();
        for(int i=0; i <= 10; i++){
           m = n*i;
            System.out.println(n+" x "+i+" = "+m);
        }

    }
}
```

### 4 - Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas.

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double t, soma=0, tMedia;
        for(int i = 0; i <=9;i++){
            System.out.println("Digite a temperatura do "+(i+1)+"º dia");
            t = input.nextDouble();
            soma = soma+t;
        }
        tMedia = soma/10;
        System.out.println("Temperatura média de todos os dias = "+tMedia+"Cº");
    }
}
```

### 5 - Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg, bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg.

```java
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
```

### 6 - Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.

```java
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
```

### 7 - Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 kg
- a média das idades das sete pessoas

```java
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
```
