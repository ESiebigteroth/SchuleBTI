package Autohaus;

public class Autohaus {
    public static void main(String[] args){
        Auto audiA4 = new Auto();
        audiA4.setKaufpreis(34000);
        audiA4.setFarbe("schwarz");
        System.out.println("Der AudiA4 hat die Farbe :"+ audiA4.getFarbe());
        System.out.println("Der AudiA4 kostet"+ audiA4.getKaufpreis());
        Auto JannikFord = new Auto();
        JannikFord.setFarbe("spacegrey");
        JannikFord.setKaufpreis(8000);
        Verkaeufer mitarbeiterMueller = new Verkaeufer();
        mitarbeiterMueller.setName("Erich Mueller");
        mitarbeiterMueller.setBisherVerdienteProvisionen(800);
        System.out.println("Der Mitarbeiter mitarbeiterMueller hat den Namen :"+ mitarbeiterMueller.getName());
        System.out.println("Der Mitarbeiter mitarbeiterMueller verdiente an Provisionen "+ mitarbeiterMueller.getBisherVerdienteProvisionen());
    }
}
