public class Conta {
    private int numero;
    private double saldo;

    public void inicializarConta(int n){
        numero = n;
        saldo = 0;
    }
    public void exibirDados(){
        System.out.println("Número: "+ numero +" saldo: R$ "+saldo);
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        saldo = saldo-valor;
    }
}
