/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus.text;

import utils.menus.Menu;

public class FoOdMenu extends Menu {
    public static void PrintFoodMenu() {
        System.out.println("Выберите тип питания.");
        System.out.println("1. Без питания");
        System.out.println("2. FullBoard");
        System.out.println("3. FullBoardPlus");
        System.out.println("4. AllInclusive");
        System.out.println("5. AllInclusivePremium");
        System.out.println("6. UltraAllInclusive");
        PrintMenuConstants();
    }
}
