/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus.text;

import utils.menus.Menu;

public class TransPortMenu extends Menu {
    public static void PrintTransportMEnu() {
        System.out.println("Выберите транспорт.");
        System.out.println("1. Автобус");
        System.out.println("2. Самолет");
        System.out.println("3. Поезд");
        System.out.println("4. Лайнер");
        PrintMenuConstants();
    }
}
