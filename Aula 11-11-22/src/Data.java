public class Data {
   private int dia, mes, ano;

   //Construtor (Metodo especial que executado implicitamente)
   public Data(){
       setDia(0);
       setMes(0);
       setAno(0);
   }
   //---------------------------------------------------------

   //Construtor com parametro
    public Data(int dia, int mes, int ano){
        setDia(0);
        setMes(0);
        setAno(0);
    }
    //------------------------------------------------------

    public void iniciaData(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAno(a);
    }
    public String exibe(){
        return dia+"/"+mes+"/"+ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if((dia>0)&&(dia<=31))
            this.dia = dia;
        else
            this.dia = 1;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano>0)
            this.ano = ano;
        else
            this.ano = 1900;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if((mes>0)&&(mes<=12))
            this.mes = mes;
        else
            this.mes = 1;

    }

}
