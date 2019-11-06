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
    }
}
