package javBeszuras;

import java.util.Random;

public class TovabbfejlesztettBeszurorendezes {
    public static final Random r = new Random();
    public static void main(String[] args) {
        int[] tomb = randomTomb(10, 1, 11);
        javitottBeszuras(tomb);
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }

    }

    private static int[] javitottBeszuras(int[] tomb) {
        int j, ideiglenes;
        for (int i = 1; i < tomb.length; i++) {
            j = i-1; 
            ideiglenes = tomb[i];
            while (j >= 0 && tomb[j] > ideiglenes) {                
                tomb[j+1] = tomb[j];
                j = j - 1;
            }
            tomb[j+1] = ideiglenes;
        }
        return tomb;
    }
    
    private static int[] randomTomb(int hossz, int min, int max) {
        int tomb[] = new int[hossz];

        for (int i = 0; i < hossz; i++) {
            tomb[i] = r.nextInt(min, max);
        }
        return tomb;
    }

}
