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