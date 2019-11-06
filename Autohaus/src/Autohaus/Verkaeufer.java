package Autohaus;

public class Verkaeufer {
    private String name;
    private int bisherVerdienteProvisionen;

    public void setName(String zuSetzendername){
        name = zuSetzendername;
    }
    public void setBisherVerdienteProvisionen(int setzeBisherferdienteProvisionen){
        bisherVerdienteProvisionen = setzeBisherferdienteProvisionen;
    }

    public int getBisherVerdienteProvisionen() {
        return bisherVerdienteProvisionen;
    }
    Verkaeufer Eric_Mueller = new Verkaeufer();

    public String getName() {
        return name;
    }
}
