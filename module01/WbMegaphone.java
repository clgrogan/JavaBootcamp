public class WbMegaphone {

  // In this workbook, you will use your Java Megaphone and print this 10 times:
  // "If Java was easy, they would call it Python!"
  /**
   * main method
   * 
   * @param args
   */
  public static void main(String[] args) {
    String sentence = "If Java was easy, they would call it Python!";
    for (int i = 1; i <= 10; i++) {
      System.out.println(sentence);
    }
  }
}