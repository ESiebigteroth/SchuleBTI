package Auto;

public class Auto {
    protected int Geschwindigkeit;
    protected int Tankfuellung;

    public Auto(String inFahrer, int Tankfuellung){
        this.Geschwindigkeit = 0;
        this.Tankfuellung = Tankfuellung;
        Fahrer fahrer = new Fahrer(inFahrer);
    }

    public void Beschleunige(int inBeschleunige){
        Geschwindigkeit = Geschwindigkeit + inBeschleunige;
    }
    public void Bremse(int inBremse){
        Geschwindigkeit = Geschwindigkeit - inBremse;
    }

}
