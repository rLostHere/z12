import java.util.Scanner;
import static java.lang.Math.*;
import java.util.HashSet;
import java.util.Set;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] we = new int[99][9];
        for(int i = 0;i < 9; i++) {
            for (int j = 0; j < 99; j++) {
                we[j][i] = (int)(Math.random()*100) + 1;
            }
        }
        int[] piss = {1,2,7,4};
        piss =  java.util.stream.IntStream.of(piss).distinct().toArray();
        int out = 0;
        int total = 0;
        for (int i = 0; i < piss.length; i++) {
            for (int j = 0; j < 99; j++) {
                if (we[j][piss[i]] % 2 == 0) {
                    out += we[j][piss[i]];
                    total += 1;
                }
            }
        }
        out = out / total;
        System.out.println(out);
    }
}
