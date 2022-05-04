import java.util.Arrays;

public class ExUpdateArrays {
  public static void main(String[] args) {
    String[] menu = { "Espresso", "Iced Coffee", "Machiato" };
    String[] newMenu = new String[menu.length + 2];

    System.out.println(Arrays.toString(menu));

    // Change third element value
    menu[2] = "Latte";
    System.out.println(Arrays.toString(menu));

    // copying old to new
    for (int i = 0; i < menu.length; i++) {
      newMenu[i] = menu[i];
    }
    System.out.println("newMenu with values copied from menu: " + Arrays.toString(newMenu));
    newMenu[3] = "House Blend";
    newMenu[4] = "Dark Roast";
    System.out.println("newMenu plus two new items: " + Arrays.toString(newMenu));
  }
}