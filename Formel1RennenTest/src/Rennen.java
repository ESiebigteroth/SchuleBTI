import Amatourrennen.Strassenauto;
import Auto.Fahrer;
import Profirennen.Rennwagen;

public class Rennen {
    public static void main(String[] args) {
        Rennwagen[] varray = new Rennwagen[2];
        varray[0] = new Rennwagen(30,"Eric","Tesla");
        varray[1] = new Rennwagen(40,"Jannik","Ford");
        Strassenauto[] xarray = new Strassenauto[2];
        xarray[0] = new Strassenauto("Eric",50);
        xarray[1] = new Strassenauto("Jan",70);
    }
}
