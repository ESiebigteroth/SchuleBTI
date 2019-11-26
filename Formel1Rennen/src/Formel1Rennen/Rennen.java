package Formel1Rennen;
import java.util.Random;
import java.util.Arrays;


public class Rennen {
    public static double getRandomNumber(){
        double x = Math.random();
        return x;
    }


    public static void main(String[] args) {
        boolean Ziel;
        int i;
        int[] MeineZahl = new int[20];
        Fahrer[] alleFahrer = new Fahrer[5];




        Random rand = new Random();


        for (i = 0; i == 4; i++);{
            alleFahrer[i] = new Fahrer();
        }
        alleFahrer[0].setName("Test1");
        alleFahrer[1].setName("Test2");
        alleFahrer[2].setName("Test3");
        alleFahrer[3].setName("Test4");


        while (alleFahrer[0].getKM() > 5000 || alleFahrer[1].getKM() > 5000 || alleFahrer[2].getKM() > 5000 || alleFahrer[3].getKM() > 5000 ){

            for (i = 0; i == 4; i++);{
                int Zufall = rand.nextInt(99)+1;
                alleFahrer[i].setGeschwindigkeit(Zufall);
                alleFahrer[i].setKM(10*alleFahrer[0].getGeschwindigkeit());
            }

        }

        // initializing unsorted int array
        int iArr[] = {alleFahrer[0].getKM(), alleFahrer[1].getKM(), alleFahrer[2].getKM(), alleFahrer[3].getKM()};


        // sorting array
        Arrays.sort(iArr);

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : iArr) {
            System.out.println("Platz 1 ist der Fahrer mit = " + number);
        }


    }
}


