### 1 - Leia três números inteiros e imprima a média aritmética entre esses números.

```java
import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
        System.out.println("Digite um valor:");
        n1 = input.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = input.nextInt();
        System.out.println("Digite outro valor: ");
        n3 = input.nextInt();
        System.out.println("A média aritmética dos valores é = "+(n1+n2+n3)/3);
    }  
}
```

### 2 - Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
a)A idade da pessoa no ano atual<P>
b)A idade que a pessoa terá em 2050
  
```java
import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
    int anoAt, anoNasc;
        System.out.println("Digite o seu ano de nascimento: ");
        anoNasc = input.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAt = input.nextInt();
        System.out.println("Sua idade é "+(anoAt-anoNasc)+" anos");
        System.out.println("Em 2050 a sua idade será "+(2050-anoNasc)+" anos"); 
        }
    }
}
```

### 3 - Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.

```java
import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        double dolar, valor;
        System.out.println("Digite a cotação atual do dolar em R$:");
        dolar = input.nextDouble();
        System.out.println("Digite o valor que pussui em Dolar $:");
        valor = input.nextDouble();
        System.out.println("Você pussuí R$ "+(valor*dolar)+" na cotação atual do dolar");
    }
    }
}
```

### 4 - Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2 

```java
import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        float dMaior, dMenor;
        System.out.println("Para descobrir a AREA  de um losango, digite: ");
        System.out.println("Valor da DIAGONAL MAIOR: ");
        dMaior = input.nextFloat();
        System.out.println("Valor da DIAGONAL MENOR: ");
        dMenor = input.nextFloat();
        System.out.println("A AREA do losango é = "+(dMaior*dMenor)/2);
        
    }
    }
}
```

### 5 - Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)

```java
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
```

### 6 - Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).

```java
import java.util.Scanner;
public class Main { 
 
    public static void main(String[] args) {
    float a, b, c, delta, x1, x2;

    System.out.println("\n Digite o Valor de A ");
    Scanner input = new Scanner(System.in);
    a = input.nextFloat();                   
    System.out.println("\n Digite o Valor de B ");
    b = input.nextFloat();
    System.out.println("\n Digite o Valor de C ");
    c = input.nextFloat();

    delta = b * b - 4 * a * c;

	if (delta > 0) {
	x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));

	x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));

	System.out.println("\n Valor de X' e = " +x1+ "\n Valor de X'' e = " + x2);
	} else {
	System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");
   }
   }
}     
```

### 7 - Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário

```java
import java.util.Scanner;
public class Main { 
 
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
        float salMin, sal;
        System.out.println("Digite o salário mínimo atual:");
        salMin = input.nextFloat();
        System.out.println("Digite o seu salário atual:");
        sal = input.nextFloat();
        System.out.println("Você recebe "+sal/salMin+" Salários minimos");
    }
    }
}
```

### 8 - Leia um número e imprima a tabuada de multiplicar deste número.

```java
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        int n;
        System.out.println("Digite um número para descobrir seus multiplos");
        n = input.nextInt();
        System.out.println(n+" x 1 = "+n*1);
        System.out.println(n+" x 2 = "+n*2);
        System.out.println(n+" x 3 = "+n*3);
        System.out.println(n+" x 4 = "+n*4);
        System.out.println(n+" x 5 = "+n*5);
        System.out.println(n+" x 6 = "+n*6);
        System.out.println(n+" x 7 = "+n*7);
        System.out.println(n+" x 8 = "+n*8);
        System.out.println(n+" x 9 = "+n*9);
        System.out.println(n+" x 10 = "+n*10);
    }
    }
}
```

### 9 - Receba um número positivo, calcule e mostre:
a) O número digitado ao quadrado</p>
b) O número digitado ao cubo</p>
c) A raiz quadrada do número digitado</p>
d) A raiz cúbica do número digitado.</p>

```java
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        double n;
        System.out.println("Digite um valor positivo:");
        n = input.nextDouble();
        System.out.println("O número digitado ao quadrado é = "+n*2);
        System.out.println("O número digitado ao cubo é = "+n*3);
        System.out.println("A raiz quadrada do número digitado é = "+n/2);
        System.out.println("A raiz cúbica do número digitado é = "+n/3);     
    }
    }
}
```

### 10 - Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Faça um programa que leia o valor gasto pelo cliente e informe o valor a ser pago de gorjeta.

```java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        double valor;
        System.out.println("Didite o valor gasto pelo cliente:");
        valor = input.nextDouble();
        System.out.println("Valor da gorjeta = R$ "+valor*0.10);
    }
    }
 }
```

### 11 - Faça um programa que receba um número inteiro e que imprima o antecessor, o sucessor, o dobro e a metade do número informado. 

```java
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);{
        int n;
        System.out.println("Digite um valor inteiro:");
        n = input.nextInt();
        System.out.println("Número antencessor ao valor digitado: "+(n-1));
        System.out.println("Nùmero sucessor ao valor digitado: "+(n+1));
        System.out.println("O dobro do número digitado: "+(n*2));
        System.out.println("A metade do número digitado: "+(n/2));
    }
    }
}
```

### 12 - Faça um programa que, tendo como dados de entrada a altura (H - em metros) de um homem, calcule e apresente seu peso ideal utilizando a seguinte fórmula: 
Peso ideal (P) = (72,7 * H)–58. 

```java
import java.util.Scanner; 
public class Main{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double altura, peso;
    System.out.println("Qual o peso ideial para um Homem?");
    System.out.print("Digite a sua altura: ");
    altura = input.nextDouble();
    peso = 72.7*altura-58;
    System.out.println("O seu peso ideal é: "+peso+"kg");
}
} 
```

### 13 - Faça o mesmo programa do item anterior, utilizando a fórmula para o cálculo do peso ideal para mulheres:
Peso ideal (P) = (62,1 * H) – 44,7

```java
import java.util.Scanner; 
public class Main{
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double altura, peso;
        System.out.println("Qual o peso ideial para uma Mulher?"); 
        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();
        peso = 62.1* altura-44.7;
        System.out.println("O seu peso ideial é: "+peso+"Kg");
        }
} 
```

### 14 - Faça um programa que leia duas variáveis e troque o conteúdo dessas duas variáveis. Em seguida, imprima o valor dessas variáveis invertido. Exemplo: A = 7, B = 9. Saída: A = 9, B = 7.

```java
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
```

### 15 - Considerando uma eleição de apenas dois candidatos, faça um programa que leia o número total de eleitores, o número de votos do primeiro candidato e o número de votos do segundo candidato. Em seguida, o programa deverá apresentar o percentual de votos de cada um dos candidatos e o percentual de votos nulos.

```java
import java.util.Scanner; 
public class Main{
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int eleitores, cand1, cand2, porCand1, porCand2, porNulos; 
    System.out.println("Insira o numero total de elitores: ");
    eleitores = input.nextInt();
    System.out.println("Quantos votos teve o candidato 1? ");   
    cand1 = input.nextInt();
    System.out.println("Quantos votos teve o candidato 2? "); 
    cand2 = input.nextInt();
    porCand1 = cand1*100/eleitores; 
    porCand2 = cand2*100/eleitores; 
    porNulos = 100-porCand1-porCand2;
    System.out.println("porcentagem de votos %"); 
    System.out.println("caditado 1 = "+porCand1+"%"); 
    System.out.println("caditado 2 = "+porCand2+"%"); 
    System.out.println("Nulos ="+porNulos+"%");
} 
}
```
