package Amateurrennen;
import Auto.*;

public class Strassenauto extends Auto{
    public int nitro;
    public Strassenauto(){
        nitro = 100;
        Geschwindigkeit = 0;
        Tank = 100;
    }

    public int getNitro() {
        return nitro;
    }

    public void setNitro(int nitro) {
        this.nitro = nitro;
    }
}
