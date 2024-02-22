import java.util.Scanner;
import static java.lang.Math.*;
import java.util.HashSet;
import java.util.Set;

public class main{
    public static void main(String[] args) {
        int[] piss = {1,2,7,4};
        int[][] we = new int[99][9];
        System.out.println("output:" + tab(we,piss));
    }

    static int tab(int we[][], int piss[]) {
        System.out.println("doin crap");
        for(int i = 0;i < 9; i++) {
            for (int j = 0; j < 99; j++) {
                we[j][i] = (int)(Math.random()*100) + 1;
            }
        }
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
        return out;
    }
}