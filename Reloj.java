
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    Reloj(){
        hora=12;
        minuto=0;
        segundo=0;
    }
    Reloj(int hora,int minuto,int segundo){
            this.hora=hora;
            this.minuto=minuto;
            this.segundo=segundo;
    }
    Reloj(double segundos){
        hora=(int)(segundos/3600);
        minuto=(int)(((segundos/3600)-hora)*3600/60);
        segundo=(int)Math.round((((((segundos/3600)-hora)*3600/60)-minuto)*60));
        if(hora==24){
            hora=0;
        }
    }
    public boolean setReloj(double segundos){
        if(segundos>=0 && segundos<=86400){
            hora=(int)(segundos/3600);
            minuto=(int)(((segundos/3600)-hora)*3600/60);
            segundo=(int)Math.round((((((segundos/3600)-hora)*3600/60)-minuto)*60));
            if(hora==24){
                hora=0;
            }
            return true;
        }else{
            System.out.println("No se puede definir el horario por que valor esta fuera de rango");
            return false;
        }
    }
    //falta el tercer contruc
    public boolean validacion(int hora,int minuto,int segundo){
        return ( (hora>=0 && hora<=23) && (hora>=0 && hora<=59) && (hora>=0 && hora<=59) );
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora>=0 && hora<=23){
            this.hora = hora;
        }else{
            System.out.println("No se puede definir el horario por que valor esta fuera de rango");
        }

    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0 && minuto<=59){
            this.minuto = minuto;
        }else{
            System.out.println("No se puede definir el horario por que valor esta fuera de rango");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo>=0 && segundo<=59){
            this.segundo = segundo;
        }else{
            System.out.println("No se puede definir el horario por que valor esta fuera de rango");
        }
    }
    public String toString(){
        String tiempo="";
        tiempo="["+hora+":"+minuto+":"+segundo+"]";
        return tiempo;
    }
    public void addReloj(Reloj Rauxiliar){
        this.hora=Rauxiliar.getHora();
        this.minuto=Rauxiliar.getMinuto();
        this.segundo=Rauxiliar.getSegundo();
    }
    //Como no esta aclarado que tiene que pasar cuando el segundo llega a 0 lo voy a dejar en 0.
    public void tickDecrement(){
        this.segundo--;
        if(segundo<=0){
            this.segundo=0;
        }
    }
    public void tick(){
        this.segundo++;
        if(segundo==60){
            segundo=0;
        }
    }
    public String restaReloj(Reloj R){
        Reloj r_auxi;
        double S1=hora*3600+minuto*60+segundo;
        double S2=R.getHora()*3600+R.getMinuto()*60+R.getSegundo();
        double S3;
        if(S1>=S2){
            S3=S1-S2;
        }else{
            S3=S2-S1;
        }
        r_auxi=new Reloj(S3);
        return r_auxi.toString();
    }


    public String verReloj() {
        return String.format("[%02d", this.hora) + ":" + 
			   String.format("%02d", this.minuto) + ":" +
			   String.format("%02d]", this.segundo); 
    }
}
