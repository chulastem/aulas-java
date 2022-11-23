### 1 - Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.

```java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite um valor:");
		n1 = input.nextInt();
		System.out.println("Digite outro valor:");
		n2 = input.nextInt();
		if(n1<n2){
		    System.out.println(n1+" é menor e "+n2+" é maior");
		}else{if(n2<n1){
		    System.out.println(n2+" é menor e "+n1+" é maior");
		}else{if(n1 == n2){
		    System.out.println(n1+" é igual a "+n2);
		}
	}
}
}
}
```

### 2 - Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: (>= 7 -> Aprovado | < 7 -> Reprovado)

```java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, total;
		System.out.println("Digite a primeira nota de aluno (0 a 10):");
		n1 = input.nextInt();
		System.out.println("Digite a segunda  nota de aluno (0 a 10):");
		n2 = input.nextInt();
		total = (n1+n2)/2;
		
		if(total>=7){
		    System.out.println("Aluno aprovado");
		}else{
		    System.out.println("Aluno reprovado");
		}
	
	}
}
```

### 3 - Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:
|  Média   | Mensagem  |
|----------|-----------|
| >=0 & <3 | REPROVADO |
| >=3 & <7 | EXAME     |
| >=7 & <10| APROVADO  |

```java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, total;
		System.out.println("Digite a primeira nota de aluno (0 a 10):");
		n1 = input.nextInt();
		System.out.println("Digite a segunda  nota de aluno (0 a 10):");
		n2 = input.nextInt();
		System.out.println("Digite a terceira nota de aluno (0 a 10):");
		n3 = input.nextInt();
		total = (n1+n2+n3)/3;
		
		if(total>=0 && total<3){
		    System.out.println(" Reprovado");
		}else{if(total>=3 && total <7){
		    System.out.println(" Exame");
		}else{if(total>=7 && total <=10){
		    System.out.println(" Aprovado");
	    }
}
}
}
}
```
