package Profirennen;

import Auto.*;

public class Rennwagen extends Auto {
    public boolean Boxenstop;
    public String Hersteller;
    public Rennwagen(int Tankfuellung, String inFahrer, String inHersteller){
        super(inFahrer,Tankfuellung);
        Boxenstop = false;
        Hersteller = inHersteller;
    }
    public void BoxenstopTrue(){
        Boxenstop = true;
        Geschwindigkeit = 0;
    }

    public void  BoxenstopFalse(){
        Boxenstop = false;
        Geschwindigkeit = 30;
    }

}
