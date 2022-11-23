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