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