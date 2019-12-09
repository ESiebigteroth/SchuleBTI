package Profirennen;
import Auto.*;

public class Rennwagen extends Auto{
    boolean Boxenstop;
    boolean Reifen;
    private Auto autoDesFahrers;

    public Rennwagen(){
        Geschwindigkeit = 0;
        Tank = 30;
        Boxenstop = false;
        Reifen = true;
    }

    public void setBoxenstop ( boolean boxenstop){
        Boxenstop = boxenstop;
    }

    public void leiteBoxenstopein(){
        setBoxenstop(true);
        autoDesFahrers.Bremse(autoDesFahrers.getGeschwindigkeit());
    }

    public void endeBoxenstop(int tempo){
        autoDesFahrers.setTankfuellung(30);
        setBoxenstop(false);
        autoDesFahrers.Beschleunige(tempo);
    }
}
