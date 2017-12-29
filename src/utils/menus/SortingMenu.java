/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import utils.Constants;

public class SortingMenu {
    public static void PrintSortingMenu() {
        System.out.println("Выберите тип сортировки.");
        System.out.println("1. По типу тура.");
        System.out.println("2. По количеству дней.");
        System.out.println("3. По типу питания.");
        System.out.println("4. По виду транспорта.");
        System.out.println(Constants.PREVIOUS_MENU);
        System.out.print("Ваш выбор: ");
    }
}
