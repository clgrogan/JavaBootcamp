import java.util.Arrays;

public class ExReferenceTrap {
  public static void main(String[] args) {
    System.out.println("\nAvoid the reference trap by not setting one array equal to another array.\n");

    int[] numbers1 = { 1, 2, 3 };
    int[] numbers2 = numbers1;
    System.out.println("int[] numbers1 = {1,2,3};\nint[] numbers2 = numbers1;");
    System.out.println("syso numbers1: " + numbers1);
    System.out.println("syso numbers2: " + numbers2);
    System.out.println("syso numbers1 Arrays.toString: " + Arrays.toString(numbers1));
    System.out.println("syso numbers2 Arrays.toString: " + Arrays.toString(numbers2));

    numbers1[1] = 666;
    System.out.println("\nnumbers1[1] = 666;");
    System.out.println("syso numbers1: " + numbers1);
    System.out.println("syso numbers2: " + numbers2);
    System.out.println("syso numbers1 Arrays.toString: " + Arrays.toString(numbers1));
    System.out.println("syso numbers2 Arrays.toString: " + Arrays.toString(numbers2));

    System.out.println(
        "\nIf you need to copy the values of an array to a new array, then use:\n\tArrays.copyOf(original, newLength)\n");

    int[] numbers3 = Arrays.copyOf(numbers1, 5);
    System.out.println("Example of using Arrays.copyOf() method:");
    System.out.println("int[] numbers3 = Arrays.copyOf(numbers1, 5);");
    System.out.println("syso numbers1: " + numbers1);
    System.out.println("syso numbers3: " + numbers3);
    System.out.println("syso numbers1 Arrays.toString: " + Arrays.toString(numbers1));
    System.out.println("syso numbers3 Arrays.toString: " + Arrays.toString(numbers3));
    numbers1[1] = 22;
    System.out.println("\nnumbers1[1] = 22;");
    System.out.println("syso numbers1: " + numbers1);
    System.out.println("syso numbers2: " + numbers2);
    System.out.println("syso numbers3: " + numbers3);
    System.out.println("syso numbers1 Arrays.toString: " + Arrays.toString(numbers1));
    System.out.println("syso numbers2 Arrays.toString: " + Arrays.toString(numbers2));
    System.out.println("syso numbers3 Arrays.toString: " + Arrays.toString(numbers3));
    System.out.println();

  }
}