### 1.Leia três números inteiros e imprima a média aritmética entre esses números.

```
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

### 2.Faça um programa que receba o ano de nascimento de uma pessoa, o ano atual e imprima:
a)A idade da pessoa no ano atual<P>
b)A idade que a pessoa terá em 2050
  
```
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
