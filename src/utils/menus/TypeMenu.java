/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import beans.YourTravel;
import utils.*;
import utils.menus.text.SortingMenu;
import utils.menus.text.TyPeMenu;
import utils.sort.type.*;

public class TypeMenu extends Menu {
    /**
     * Displays the type menu.
     * @param Tours current collection
     * @return edited collection
     */
    public static YourTravel RunTypeMenu(YourTravel Tours) {
        System.out.println();
        TyPeMenu.PrintTypeMenu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.REST:
                        Tours = SortByRest.SortingByRest(Tours);
                        break;
                    case Constants.EXCURSION:
                        Tours = SortByExcursion.SortingByExcursion(Tours);
                        break;
                    case Constants.TREATMENT:
                        Tours = SortByTreatment.SortingByTreatment(Tours);
                        break;
                    case Constants.SHOPPING:
                        Tours = SortByShopping.SortingByShopping(Tours);
                        break;
                    case Constants.CRUISE:
                        Tours = SortByCruise.SortingByCruise(Tours);
                        break;
                    case Constants.EXIT:
                        System.out.println();
                        SortingMenu.PrintSortingMenu();
                        return Tours;
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                        System.out.print(Constants.CHOSE_COMMAND);
                }
            }
    }
}
