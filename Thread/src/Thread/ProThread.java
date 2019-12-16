package Thread;

public class ProThread extends Thread{
    private Lager p1;

    public ProThread (Lager p1_) {
        super("Produzent");
        p1 = p1_;
    }

    public void run(){
        while (p1.offen()) {
            p1.ergaenze((int) (5 + Math.random ()*1000));
            try {
                sleep((int) (1000 + Math.random() * 3000));
            }
            catch (InterruptedException ie){
                System.err.println (ie.toString());
            }
        }
    }
}