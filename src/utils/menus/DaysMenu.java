/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import beans.YourTravel;
import utils.*;
import utils.menus.text.DaYsMenu;
import utils.menus.text.SortingMenu;
import utils.sort.days.SortByOneNine;
import utils.sort.days.SortByTenTwenty;
import utils.sort.days.SortByTwentyPlus;

public class DaysMenu extends Menu {
    public static YourTravel RunDaysMenu(YourTravel Tours) {
            System.out.println();
            DaYsMenu.PrintDaysMenu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.ONE_NINE:
                        Tours = SortByOneNine.SortingByOneNine(Tours);
                        break;
                    case Constants.TEN_TWENTY:
                        Tours = SortByTenTwenty.SortingByTenTwenty(Tours);
                        break;
                    case Constants.TWENTY_PLUS:
                        Tours = SortByTwentyPlus.SortingByTwentyPlus(Tours);
                        break;
                    case Constants.EXIT:
                        System.out.println();
                        SortingMenu.PrintSortingMenu();
                        return Tours;
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                }
            }
    }
}
