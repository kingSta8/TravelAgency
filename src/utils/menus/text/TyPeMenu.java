package utils.menus.text;

import utils.menus.Menu;

public class TyPeMenu extends Menu {
    public static void PrintTypeMenu() {
        System.out.println("Выберите тип тура.");
        System.out.println("1. Отдых.");
        System.out.println("2. Экскурсии.");
        System.out.println("3. Лечение.");
        System.out.println("4. Шоппинг.");
        System.out.println("5. Круиз.");
        PrintMenuConstants();
    }
}
