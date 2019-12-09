package Amatourrennen;
import Auto.*;

public class Strassenauto extends Auto {
    private int Nitro;
    public Strassenauto(String inFahrer, int Tankfuellung){
        super(inFahrer,Tankfuellung);
        Tankfuellung = 50;
        Geschwindigkeit = 0;
        Nitro = 10;
    }

    void nitro(){
        if (Nitro > 0){
            Geschwindigkeit = Geschwindigkeit * 2;
        }
        else{
            System.out.println("Du hast kein Nitro mehr");
        }
        Nitro -= 10;
    }

}
