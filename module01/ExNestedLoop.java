import javax.sql.rowset.spi.SyncResolver;

public class ExNestedLoop {
  public static void main(String[] args) {
    System.out.println("\n One application of nested loops is to process 2D arrays.");
    for (int i = 0; i < 3; i++) {
      System.out.println("run: " + i);
      for (int j = 0; j < 3; j++) {
        System.out.println("  inner run: " + j);
      }
    }
  }

}