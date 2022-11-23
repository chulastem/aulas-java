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

