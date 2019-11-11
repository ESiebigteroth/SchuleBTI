package Formel1Rennen;

public class Auto {
    private boolean Boxenstop;
    private int Tankfuellung;
    private int Geschwindigkeit;

    public void Beschleunige(int geschwindigkeit) {
        Geschwindigkeit = Geschwindigkeit + geschwindigkeit;
    }

    public void Bremse(int geschwindigkeit) {
        Geschwindigkeit = Geschwindigkeit - geschwindigkeit;
    }

    public void setTankfuellung(int tankfuellung) {
        Tankfuellung = tankfuellung;
    }

    public void setBoxenstop(boolean boxenstop) {
        Boxenstop = boxenstop;
    }

    public int getGeschwindigkeit() {
        return Geschwindigkeit;
    }
}
