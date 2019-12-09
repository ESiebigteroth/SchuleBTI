package Auto;

public class Auto {
    public int Geschwindigkeit;
    public int Tank;
    private boolean Boxenstop;
    private int Tankfuellung;

    public void setTankfuellung ( int tankfuellung){
        Tank = tankfuellung;
    }

    public void Beschleunige ( int geschwindigkeit){
        Geschwindigkeit = Geschwindigkeit + geschwindigkeit;
    }

    public void Bremse ( int geschwindigkeit){
        Geschwindigkeit = Geschwindigkeit - geschwindigkeit;
    }

    public int getGeschwindigkeit () {
        return Geschwindigkeit;
    }
}
