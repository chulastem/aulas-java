

//1.Leia três números inteiros e imprima a média aritmética entre esses números.

```
public class Exercicios1 { 
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

//2.Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
//a)A idade da pessoa no ano atual
//b)A idade que a pessoa terá em 2050

```
public class Exercicios1 { 
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

//3.Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.

```
public class Exercicios1 { 
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

//4.Faça um programa que calcule e mostre a área de um losango AREA = (DIAGONAL MAIOR * DIAGONAL MENOR)/2 

```
public class Exercicios1 { 
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

//5.Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)

```
public class Exercicios1 { 
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

//6.Faça um programa que solicite ao usuário que informe os coeficientes a, b e c de uma equação de segundo grau, 
//e que imprima as raízes desta equação (considere que os valores informados sempre retornarão raízes reais para a equação).



