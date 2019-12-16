package Thread;

public class KonThread extends Thread {
    private Lager p1;

    public KonThread(Lager p1_) {
        super("Konsument");
        p1 = p1_;
    }

    public void run() {
        while (p1.offen()) {
            p1.liefere((int) (5 + Math.random * 100));
            try {
                sleep((int) (1000 + Math.random() * 3000));
            } catch (InterruptedException ie) {
                System.err.println(ie.toString());
            }

        }

    }
}