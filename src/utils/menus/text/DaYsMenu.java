package utils.menus.text;

import utils.menus.Menu;

public class DaYsMenu extends Menu {
    public static void PrintDaysMenu() {
        System.out.println("Выберите количество дней.");
        System.out.println("1. 1-9");
        System.out.println("2. 10-20");
        System.out.println("3. 20+");
        PrintMenuConstants();
    }
}
