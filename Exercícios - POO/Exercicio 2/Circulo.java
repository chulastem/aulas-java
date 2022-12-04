public class Circulo {
    private double raio;

    public Circulo (double raio){
        if (raio >= 0)
            this.raio = raio;
        else
            this.raio = 0;
    }
    public double area(){
        return Math.PI * Math.pow(raio,2);

    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }
    public String exibe(){
        return "Raio: "+ raio +
                "\nÁrea: "+ area()+
                "\nPerimetro: "+ perimetro();

    }
}