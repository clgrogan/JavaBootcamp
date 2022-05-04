public class ExIntroToArrays {
  public static void main(String[] args) {
    String[] kingdoms = { "Mercia", "Wessex", "Northumbria", "E.A." };

    System.out.println();
    System.out.println("Print kingdoms object reference: " + kingdoms);
    System.out.println();

    for (String kingdom : kingdoms) {
      System.out.println(kingdom);
    }
  }
}