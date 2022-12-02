# Programação Orientada a Objetos

### 1 - Criar uma classe chamada Time, para armazenar internamente Hora, Minutos e Segundos.
- Não permita atribuição direta e só aceitar valores válidos (0-23 ou 0-59)
- Criar um método setTime para passar a hora, minuto e segundos de uma só vez
- Implementar um método set e um get para cada atributo 
#### Criar 2 construtores:
- Sem nenhuma informação passada (o time padrão será 0:0:0)
- Passando a hora, minutos e segundos iniciais 
- Criar um método que retorne uma string contendo uma hora no formato h:mm:s

#### Crie dois objetos na classe principal, um utilizando o construtor sem nenhuma informação, e o outro passando a hora, minutos e segundos. Imprima em seguida os dados dos dois objetos utilizando o método que retorna a string com esses dados.

## Main

```java
public class Main {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime(20,30,59);
        System.out.println(t.exibe());
        Time t2 = new Time();
        System.out.println(t2.exibe());
    }
}
```
## Time

```java
public class Time {
    private int hora, minuto, segundo;

    public Time(){
        setTime(00,00,00);
    }
    public Time(int hora, int minuto, int segundo){
        setTime(hora,minuto,segundo);
    }
    public void setTime(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public String exibe(){
        return hora + ":" +minuto+":"+segundo;
    }
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23)
            this.hora = hora;
        else
            this.hora = 0;
    }

    public void setMinuto(int minuto) {
        if(minuto>= 0 && minuto<= 59)
            this.minuto = minuto;
        else
            this.minuto = 0;
    }
    public void setSegundo(int segundo) {
        if(segundo>= 0 && segundo <=59)
            this.segundo = segundo;
        else
            this.segundo = 0;
    }
}

```
#
### 2. Criar uma classe chamada Circulo que possua:
- Atributo real raio, que representa o tamanho do raio do círculo
- Método para calcular a área (Área = Pi * raio2) – utilize a constante Math.PI e a função Math.pow(base, expoente), da classe Math
- Método para calcular o perímetro do círculo (Perímetro = 2 * Pi * raio)
- Método que retorna uma única string, contendo as seguintes informações do círculo:
- Raio: raio
- Área: area
- Perímetro: perimetro
- Crie um construtor que receba como parâmetro raio do círculo.
- Crie um objeto na classe principal
#### Em seguida, imprima os dados do círculo utilizando o método que retorna a string com as informações do círculo

## Main

```java
public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(10);
        System.out.println(c.exibe());
    }
}
```
## Circulo

```java
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
```
