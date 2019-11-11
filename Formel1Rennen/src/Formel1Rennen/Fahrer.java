package Formel1Rennen;

public class Fahrer {
    public int Rangfolge;
    private Auto autoDesFahrers;
    public String Name;
    public int tempo;


    public void drückeGaspedal(int wieviel){
        autoDesFahrers.Beschleunige(wieviel);
    }
    public void drückeBremspedal(int wieviel){
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
