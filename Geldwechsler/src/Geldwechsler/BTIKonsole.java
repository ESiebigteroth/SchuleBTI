package Geldwechsler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class BTIKonsole {
    private static BufferedReader meineEingabe = new BufferedReader(new InputStreamReader(System.in));
    public static int leseInteger(){
        int integerWert = 0;
        try {
            integerWert = Integer.parseInt(meineEingabe.readLine());
        } catch (IOException e){
            System.err.println("Fehler beim Lesen des IntegerWertes("+ e +")");
        }
        return integerWert;
    }
    public static int leseInteger(String ausgabeText){
        System.out.println(ausgabeText);
        return leseInteger();
    }
    public static float leseFloat(){
        float floatwert = 0;
        try {
            floatwert = Float.parseFloat(meineEingabe.readLine());
        } catch (NumberFormatException e) {
            System.err.println("Das war keine gültige Fliekommazahl");
        } catch (IOException e){
            System.err.println("Allgemeiner Fehler beim Lesen des " + " FloatWertes("+ e + ")");
        }
        return floatwert;
    }
    public static float leseFloat(String ausgabeText){
        System.out.println(ausgabeText);
        return leseFloat();
    }
    public static String leseString(){
        String meinString = new String();
        try {
            meinString = meineEingabe.readLine();
        }catch (IOException e) {
            System.err.println("Allgemeiner Fehler beim Lesen der " + "Konsole ("+ e + ")");
        }
        return meinString;
    }
    public static String leseString(String ausgabeText){
        System.out.println(ausgabeText);
        return leseString();
    }
    public static String formatierteAusgabe(double zahl){
        String sDummy;
        DecimalFormat meineAusgabe = new DecimalFormat("#0.00");
        sDummy = meineAusgabe.format(zahl);
        return sDummy;
    }
}
