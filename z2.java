import static java.lang.Math.*;

public class z2{
    public static void main(String[] args) {
        int x = (int)(Math.random()*10) + 11;
        int[][] t = new int[x][x];
        RandomFill100(t);
        showArray(t);
        int[] large = checkForLargest(t);
        int[] rowncol = ratioRowAndCol(t);
        int total = compareToRowTimesCol(t);
        System.out.println("1st largest " + large[0] + " | 2nd largest " + large[1]); 
        System.out.println("row values: " + rowncol[0] + " | column values: " + rowncol[1]); 
        System.out.println("3rd thingy: " + total); 
    }
    public static void RandomFill100(int t[][]) {
        for(int i = 0;i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i == j) {
                    if ((int)(Math.random()*200)- 100 > 0) {
                        t[j][i] = 1;
                    }
                    else {
                        t[j][i] = -1;
                    }
                }
                else {
                    t[j][i] = (int)(Math.random()*200) -99;
                }
            }
        }
    }
    public static void showArray(int t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.print("\n"); 
        }
    }

    public static int[] ratioRowAndCol(int t[][]) {
        int row = 0;
        int col = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i % 2 == 0) {
                    row += t[i][j];
                }
                if (j % 2 != 0) {
                    col += t[i][j];
                }
            }
        }
        int[] out = {row,col};
        return out;
    }

    public static int[] checkForLargest(int t[][]) {
        int largest = -101;
        int large = -101;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] > largest) {
                    large = largest;
                    largest = t[i][j];
                }
                else if (t[i][j] > large && t[i][j] != largest) {
                    large = t[i][j];
                }
            }
        }
        int[] out = {largest, large};
        return out;
    }

    public static int compareToRowTimesCol(int t[][]) {
        int total = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i * j > t[i][j]) {
                    total += 1;
                }
            }
        }
        return total;
    }
}