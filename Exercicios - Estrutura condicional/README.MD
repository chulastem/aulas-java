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
| >=7 & <=10| APROVADO  |

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
### 4 - Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C;

        System.out.print("Verificador de Triângulo\n\n");

        System.out.print("Digite o lado A=");
        A = entrada.nextInt(); 

        System.out.print("Digite o lado B=");
        B = entrada.nextInt(); 

        System.out.print("Digite o lado C=");
        C = entrada.nextInt(); 


        if( A < B + C && B < A + C && C < A + B ){ 
            if(A==B && B == C){ 
                System.out.print("O triângulo é Eqüilátero.");
            }else if(A==B || A==C || B==C){ 
                System.out.print("O triângulo é Isósceles.");
            }else{ 
                System.out.print("O triângulo é Escaleno.");
            }
        }else{ 
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }

    }

}
```

### 5 - Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
Peso ideal (homens) = (72,7 * H) – 58. 
Peso ideal (mulheres) = (62,1 * H) – 44,7

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Altura,PesoIdeal;
        char Sexo='n';

        System.out.print("Digite sua altura (em metros): ");
        Altura = entrada.nextDouble();

        while(Sexo !='m' && Sexo !='M' && Sexo !='h' && Sexo !='H'){

            System.out.print("Digite H ou M para especificar o sexo: "); // o/
            Sexo = entrada.next(".").charAt(0);

            switch(Sexo){
                case 'h':
                case 'H':
                    PesoIdeal = ( 72.7* Altura ) - 58;
                    System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
                    break;
                case 'm':
                case 'M':
                    PesoIdeal = ( 62.1 * Altura ) - 44.7;
                    System.out.println("Seu peso ideal é de: "+PesoIdeal+" kg.");
                    break;
                default:
                    System.out.println("Não é M");
            }

        }
    }

}
```

### 6 - Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2
e, a situação do peso é determinada pela tabela abaixo:
|Condição	    |Situação          |
|-------------------|------------------|
|IMC abaixo de 20   |	Abaixo do peso |
|IMC de 20 até 25   |	Peso Normal    |
|IMC de 25 até 30   |	Sobre Peso     |
|IMC de 30 até 40   |	Obeso          |
|IMC de 40 e acima  |	Obeso Mórbido  |

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, alt, imc;
        System.out.println("Digite seu peso:");
        peso = input.nextDouble();
        System.out.println("Digite sua altura");
        alt = input.nextDouble();
        imc = peso/(alt*alt);
        if(imc<20){
            System.out.println("IMC "+imc+": Abaixo do peso");
        }else{if(imc>=20&&imc<25){
            System.out.println("IMC "+imc+": Peso normal");
        }else {
            if (imc >= 25 && imc < 30) {
                System.out.println("IMC " + imc + ": Sobre peso");
            } else {
                if (imc >= 30 && imc < 40) {
                    System.out.println("IMC " + imc + ": Obeso");
                } else {
                    if (imc >= 40) {
                        System.out.println("IMC " + imc + ": Obeso Mórbido");
                        }
                    }
                }
            }   
        }   
    }
}
```

### 7 - Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento.

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sal, aut;
        System.out.println("Digite o salário atual do funcionário");
        sal = input.nextDouble();
        if(sal < 1000.00){
            System.out.println("Funcionário tem direito ao aumento.");
            aut = (sal*30)/100;
            System.out.println("Novo salário = R$ "+(sal+aut));
        }else{
            System.out.println("Funcionário NÃO tem direito ao aumento");
        }
    }
}
```

### 8 - Faça um programa que receba a idade de um nadador e mostre a sua categoria
|IDADE	           |CATEGORIA    |
|------------------|-------------|
|até 7 anos	   | INFANTIL    |
|8 a 10 anos	   | JUVENIL     |
|11 a 15 anos	   | ADOLESCENTE |
|16 a 30 anos	   | ADULTO      |
|acima de 30 anos  | SENIOR      |

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do Nadador:");
        idade = input.nextInt();
        if(idade<=7){
            System.out.println("Idade: "+idade+" Categoria: INFANTIL");
        }else if(idade>8&&idade<=10) {
            System.out.println("Idade: "+idade+" Categoria: JUVENIL");
        }else if(idade>10&&idade<=15){
            System.out.println("Idade: "+idade+" Categoria: ADOLESCENTE");
        }else if(idade>15&&idade<=30){
            System.out.println("Idade: "+idade+" Categoria: ADULTO");
        }else if(idade>30){
            System.out.println("Idade: "+idade+" Categoria: SENIOR");
        }
    }
}
```

### 9 - Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral: 
- não eleitor (abaixo de 16 anos); 
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); 
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade para descobrir sua Classe Eleitoral:");
        idade = input.nextInt();
        if(idade<16){
            System.out.println("Não eleitor");
        }else if((idade>16&&idade<18)||(idade>65)){
            System.out.println("Eleitor facultativo");
        }else if(idade>18&&idade<65){
            System.out.println("Eleitor obrigatório");
        }
    }
}
```

### 10 - Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número de 1 a 7 para descobrir o dia da semana");
        dia = input.nextInt();
        if(dia==1){
            System.out.println("Domingo");
        }else if(dia==2){
            System.out.println("Segunda-feira");
        }else if(dia==3){
            System.out.println("Terça-feira");
        }else if(dia==4){
            System.out.println("Quarta-feira");
        }else if(dia==5){
            System.out.println("Quinta-feira");
        }else if(dia==6){
            System.out.println("Sexta-feira");
        }else if(dia==7){
            System.out.println("Sabado");
        }else{
            System.out.println("Não existe dia da semana com esse número");
        }
    }
}
```

### 11 - Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Digite um número de 1 a 12 para descobrir o Mês");
        dia = input.nextInt();
        if(dia==1){
            System.out.println("Janeiro");
        }else if(dia==2){
            System.out.println("Fevereiro");
        }else if(dia==3){
            System.out.println("Março");
        }else if(dia==4){
            System.out.println("Abril");
        }else if(dia==5){
            System.out.println("Maio");
        }else if(dia==6){
            System.out.println("Junho");
        }else if(dia==7) {
            System.out.println("Julho");
        }else if(dia==8){
            System.out.println("Agosto");
        }else if(dia==9){
            System.out.println("Setembro");
        }else if(dia==10){
            System.out.println("Outubro");
        }else if(dia==11){
            System.out.println("Novembro");
        }else if(dia==12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Não existe mês com esse número");
        }
    }
}
```

### 12. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
1 – Somar</p>
2 – Subtrair</p> 
3 – Multiplicar</p>
4 – Dividir</p>
5 – Sair</p>
Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2,m;
        System.out.println("Digite o primeiro valor:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextInt();
        System.out.println("Escolha o que fazer com os valores digitados");

        System.out.println("1-Somar");
        System.out.println("2-Subtrair");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        System.out.println("5-Sair");

        m = input.nextInt();

        switch(m){
            case 1:
                System.out.println("Soma = "+(n1+n2));
                break;
            case 2:
                System.out.println("Subtração = "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplicação = "+(n1*n2));
                break;
            case 4:
                System.out.println("Divisão = "+(n1/n2));
                break;
            case 5:
                System.out.println("Fim do programa.");
        }
    }
}
```
