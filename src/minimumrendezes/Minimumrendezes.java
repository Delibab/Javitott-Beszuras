package minimumrendezes;

public class Minimumrendezes {

    public static void main(String[] args) {
        int[] tomb = {2, 1, 3, 7, 6};
        minimumkiválasztásosRendezes(tomb);
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }

    }

    private static int[] minimumkiválasztásosRendezes(int[] tomb) {
        int min;
        int ideiglenes = 0;
        for (int i = 0; i < tomb.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[min] > tomb[j]) {
                    min = j;
                }
            }
            ideiglenes = tomb[i];
            tomb[i] = tomb[min];
            tomb[min] = ideiglenes;
        }
        return tomb;
    }

}
