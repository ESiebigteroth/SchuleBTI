package Geldwechsler;
import java.util.Scanner;

public class GeldwechlerLogik {
    private int Fünfhundert = 0;
    private int Zweihundert = 0;
    private int Hundert = 0;
    private int Fünfzig = 0;
    private int Zwanzig = 0;
    private int Zehn = 0;
    private int Fünf = 0;
    private int Zwei = 0;
    private int Ein = 0;

    static int werteEinlesen(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Geldbetrag");
        int Geldbetrag = myObj.nextInt();
        return Geldbetrag;
    }
    public void berchnen(int Geldbetrag){
        Fünfhundert = Fünfhundert + Geldbetrag / 500;
        int restFünfhundert = Geldbetrag % 500;
        Zweihundert = Zweihundert + restFünfhundert / 200;
        int restZweihundert = Fünfhundert % 200;
        Hundert = Hundert + restZweihundert / 100;
        int restHundert = Zweihundert % 100;
        Fünfzig = Fünfzig + restHundert / 50;
        int restFünfzig = Hundert % 50;
        Zwanzig = Zwanzig + restFünfzig / 20;
        int restZwanzig = Fünfzig % 20;
        Zehn = Zehn + restZwanzig / 10;
        int restZehn = Zwanzig % 10;
        Fünf = Fünf + restZehn / 5;
        int restFünf = Zehn % 5;
        Zwei = Zwei + restFünf / 2;
        int restZwei = Fünf % 2;
        Ein = Ein + restZwei / 1;

    }
    public void ergebnisAusgeben(){
        System.out.println(Fünfhundert + "* 500 € Schein");
        System.out.println(Zweihundert + "* 200 € Schein");
        System.out.println(Hundert + "* 100 € Schein");
        System.out.println(Fünfzig + "* 50 € Schein");
        System.out.println(Zwanzig + "* 20 € Schein");
        System.out.println(Zehn + "* 10 € Schein");
        System.out.println(Fünf + "* 5 € Schein");
        System.out.println(Zwei + "* 2 € Münze");
        System.out.println(Ein + "* 1 € Münze");


    }
}
