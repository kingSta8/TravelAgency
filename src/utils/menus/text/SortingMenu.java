/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus.text;

import utils.menus.Menu;

public class SortingMenu extends Menu {
    public static void PrintSortingMenu() {
        System.out.println("Выберите тип сортировки.");
        System.out.println("1. По типу тура.");
        System.out.println("2. По количеству дней.");
        System.out.println("3. По типу питания.");
        System.out.println("4. По виду транспорта.");
        PrintMenuConstants();
    }
}
