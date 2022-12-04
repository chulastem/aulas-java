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
