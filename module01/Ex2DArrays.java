import java.util.Arrays;

public class Ex2DArrays {
  public static void main(String[] args) {
    int[][] grades = new int[3][4];
    grades[0][0] = 72;
    grades[0][1] = 74;
    grades[0][2] = 78;
    grades[0][3] = 76;
    grades[1][0] = 65;
    grades[1][1] = 64;
    grades[1][2] = 63;
    grades[1][3] = 62;
    grades[2][0] = 95;
    grades[2][1] = 97;
    grades[2][2] = 99;
    grades[2][3] = 101;
    int[][] grades2 = { { 72, 74, 78, 86 }, { 65, 64, 63, 62 }, { 95, 97, 99, 101 } };

    System.out.println();
    System.out.println("\tHarry:    " + Arrays.toString(grades[0]));
    System.out.println("\tRon:      " + Arrays.toString(grades[1]));
    System.out.println("\tHermione: " + Arrays.toString(grades[2]));
    System.out.println();
    System.out.println("\tHarry:    " + Arrays.toString(grades2[0]));
    System.out.println("\tRon:      " + Arrays.toString(grades2[1]));
    System.out.println("\tHermione: " + Arrays.toString(grades2[2]));
    System.out.println();
    System.out.println("\tHarry:    " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
    System.out.println("\tRon:      " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
    System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);
    System.out.println();
  }
}
