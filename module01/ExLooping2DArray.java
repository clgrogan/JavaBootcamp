public class ExLooping2DArray {
  public static void main(String[] args) {
    int[][] grades = {
        { 72, 74, 78, 76 },
        { 65, 64, 63, 62 },
        { 96, 98, 100, 102 }
    };

    System.out.println();
    for (int i = 0; i < grades.length; i++) {
      switch (i) {
        case 0:
          System.out.print("\tHarry: ");
          break;
        case 1:
          System.out.print("\tRon: ");
          break;
        case 2:
          System.out.print("\tHermione: ");
          break;
      }
      for (int j = 0; j < grades[i].length; j++) {
        System.out.print(grades[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
