public class ExBus {
  public static void main(String[] args) {
    String sentence = "Number of passengers: ";
    System.out.println(sentence);
    int passengers = 0;
    passengers = passengers + 9;
    System.out.println(passengers);
    passengers = passengers - 5;
    System.err.println(passengers);
    passengers = passengers - 4;
    System.err.println(passengers);
    passengers += 4;
    System.err.println(passengers);
    passengers -= 4;
    System.err.println(passengers);
  }
}