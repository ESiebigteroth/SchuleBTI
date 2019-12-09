package Auto;

import Profirennen.Rennwagen;

public class Fahrer {
    public int Rangfolge;
    public String Name;

    class ProfiFahrer {
        public ProfiFahrer(){
            autoDesProfiFahrers = new  Rennwagen();
            autoDesFahrers.setTankfuellung(30);
            autoDesFahrers.Bremse(autoDesFahrers.getGeschwindigkeit());

        }


    }
    class AmateurFahrer{

    }




    private Auto autoDesFahrers;



    public Fahrer(){

        Rangfolge = 1;


    }

    public void drueckeGaspedal(int wieviel){
        autoDesFahrers.Beschleunige(wieviel);
    }

    public void drueckeBremspedal(int wieviel){
        autoDesFahrers.Bremse(wieviel);
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
