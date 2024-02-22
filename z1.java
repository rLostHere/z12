
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.HashSet;
import java.util.Set;

public class z1{
    public static void main(String[] args) {
        int[] number = {1,2,7,4};
        int[][] array = new int[99][9];
        randomFill(array);
        System.out.println("output:" + tab(array,number));
    }

    public static double tab(int array[][], int number[]) {
        System.out.println("doin crap");
        number = java.util.stream.IntStream.of(number).distinct().toArray();
        double out = 0;
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < 99; j += 2) {
                out += array[j][number[i]];
                total += 1;
            }
        }
        out = out / total;
        return out;
    }

    public static void randomFill(int[][] array) {
        for(int i = 0;i < 9; i++) {
            for (int j = 0; j < 99; j++) {
                array[j][i] = (int)(Math.random()*100) + 1;
            }
        }
    }
}