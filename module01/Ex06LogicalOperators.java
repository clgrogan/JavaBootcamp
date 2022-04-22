public class Ex06LogicalOperators {
  public static void main(String[] args) {
    // Or Operator
    System.out.println();

    System.out.println("The OR operator has three parts\t"
        + "\n\n (      1       2       3      )"
        + "\n ( comparison1 || comparison2 )"
        + "\n\n\t1. First comparison"
        + "\n\t2. OR operator:  || double pipe"
        + "\n\t3. Second comparison");

    System.out.println();

    int chemGrade = 75;
    int engGrade = 65;
    String language = "Java";
    int credits = 56;
    double GPA = 3.2;

    if (chemGrade > 75 || engGrade > 75 || language.equals("Java")) {
      System.out.println("Congrats! You got the scholarship!");
    } else {
      System.out.println("Sorry, you didn't get the scholarship.");
    }

    System.out.println();

    System.out.println("The AND operator has three parts\t"
        + "\n\n (      1       2       3      )"
        + "\n ( comparison1 || comparison2 )"
        + "\n\n\t1. First comparison"
        + "\n\t2. OR operator:  || double pipe"
        + "\n\t3. Second comparison");

    System.out.println();

    if (credits >= 40 && GPA > 2.0) {
      System.out.println("Congrats! You get your diploma.");
    } else {
      System.out.println("Sorry. No diploma for you.");
    }

    credits = 25;

    System.out.println();

    if (credits >= 40 && GPA > 2.0) {
      System.out.println("Congrats! You get your diploma.");
    } else {
      System.out.println("Sorry. No diploma for you.");
    }

    System.out.println();
  }
}
