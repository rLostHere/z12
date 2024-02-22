import static java.lang.Math.*;

public class z2{
    public static void main(String[] args) {
        int x = (int)(Math.random()*10) + 11;
        int[][] t = new int[x][x];
        for(int i = 0;i < x; i++) {
            for (int j = 0; j < x; j++) {
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
        int largest = -101;
        int large = -101;
        int row = 0;
        int col = 0;
        int total = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (t[i][j] > largest) {
                    large = largest;
                    largest = t[i][j];
                }
                else if (t[i][j] > large && t[i][j] != largest) {
                    large = t[i][j];
                }
                if (i % 2 == 0) {
                    row += t[i][j];
                }
                if (j % 2 != 0) {
                    col += t[i][j];
                }
                if (i * j > t[i][j]) {
                    total += 1;
                }
                System.out.print(t[i][j]+" ");
            }
            System.out.print("\n"); 
        }

        System.out.println("1st largest " + largest + " | 2nd largest " + large); 
        System.out.println("row values: " + row + " | column values: " + col); 
        System.out.println("3rd thingy: " + total); 
    }
}