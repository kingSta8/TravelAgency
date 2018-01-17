/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import beans.YourTravel;
import utils.*;
import utils.menus.text.FoOdMenu;
import utils.menus.text.SortingMenu;
import utils.sort.food.*;

public class FoodMenu extends Menu {
    public static YourTravel RunFoodMenu(YourTravel Tours) {
            System.out.println();
            FoOdMenu.PrintFoodMenu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.NO_FOOD:
                        Tours = SortByNoFood.SortingByNoFood(Tours);
                        break;
                    case Constants.FULL_BOARD:
                        Tours = SortByFullBoard.SortingByFullBoard(Tours);
                        break;
                    case Constants.FULL_BOARD_PLUS:
                        Tours = SortByFullBoardPlus.SortingByFullBoardPlus(Tours);
                        break;
                    case Constants.ALL_INCLUSIVE:
                        Tours = SortByAllInclusive.SortingByAllInclusive(Tours);
                        break;
                    case Constants.ALL_INCLUSIVE_PREMIUM:
                        Tours = SortByAllInclusivePremium.SortingByAllInclusivePremium(Tours);
                        break;
                    case Constants.ULTRA_ALL_INCLUSIVE:
                        Tours = SortByUltraAllInclusive.SortingByUltraAllInclusive(Tours);
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
