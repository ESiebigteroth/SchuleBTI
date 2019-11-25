package Formel1Rennen;

public class Fahrer {
    public int Rangfolge;
    private Auto autoDesFahrers;
    public String Name;
    public int tempo;
    public int KM;

    public Fahrer(){
        autoDesFahrers = new Auto();
        KM = 0;
        Rangfolge = 1;
        autoDesFahrers.setBoxenstop(false);
        autoDesFahrers.setTankfuellung(30);
        autoDesFahrers.Bremse(autoDesFahrers.getGeschwindigkeit());
    }

    public void drueckeGaspedal(int wieviel){
        autoDesFahrers.Beschleunige(wieviel);
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public int getKM() {
        return KM;
    }

    public void drueckeBremspedal(int wieviel){
        autoDesFahrers.Bremse(wieviel);
    }
    public void leiteBoxenstopein(){
        autoDesFahrers.setBoxenstop(true);
        autoDesFahrers.Bremse(autoDesFahrers.getGeschwindigkeit());
    }
    public void endeBoxenstop(int tempo){
        autoDesFahrers.setTankfuellung(30);
        autoDesFahrers.setBoxenstop(false);
        autoDesFahrers.Beschleunige(tempo);
    }

    public void setRangfolge(int rangfolge) {
        Rangfolge = rangfolge;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
