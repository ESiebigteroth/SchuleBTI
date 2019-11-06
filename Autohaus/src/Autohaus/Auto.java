package Autohaus;

public class Auto {
    private int kaufpreis;
    private String farbe;
    public void setKaufpreis(int zuSetzenderKaufpreis){
        kaufpreis = zuSetzenderKaufpreis;
    }
    public void setFarbe(String zuSetzendeFarbe){
        farbe = zuSetzendeFarbe;
    }

    public int getKaufpreis() {
        return kaufpreis;
    }
    public String getFarbe(){
        return farbe;
    }
}
