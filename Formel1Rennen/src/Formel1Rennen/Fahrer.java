package Formel1Rennen;

public class Fahrer {
    public int Rangfolge;
    private Auto autoDesFahrers;
    public String Name;


    public void drückeGaspedal(int wieviel){
        autoDesFahrers.Beschleunige(wieviel);
    }
    public void drückeBremspedal(int wieviel){
        autoDesFahrers.Bremse(wieviel);
    }
    public void leiteBoxenstopein(boolean test){
        autoDesFahrers.Bremse();
        autoDesFahrers.setTankfuellung(30);
    }
}
