import java.util.Date;
public class Cronometro {
    private long inicia;
    private long finaliza;


    public Cronometro() {
        this.inicia = new Date().getTime();
        System.out.println("(b) Constructor: cronómetro iniciado automáticamente.");
    }
    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }
    public void inicia() {
        this.inicia = new Date().getTime();
        System.out.println("(c) Método inicia(): cronómetro reiniciado.");
    }
    public void detener() {
        this.finaliza = new Date().getTime();
        System.out.println("(d) Método detener(): tiempo final registrado.");
    }
    public long lapsoDeTiempo() {
        System.out.println("(e) Método lapsoDeTiempo(): calculando diferencia...");
        return finaliza - inicia;
    }
}
