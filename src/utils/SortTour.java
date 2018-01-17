/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.YourTravel;
import utils.menus.*;
import utils.menus.text.SortingMenu;

public class SortTour {
    public static YourTravel SortingTour(YourTravel Tours) {
            System.out.println();
            SortingMenu.PrintSortingMenu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.TYPE:
                        Tours = TypeMenu.RunTypeMenu(Tours);
                        break;
                    case Constants.DAYS:
                        Tours = DaysMenu.RunDaysMenu(Tours);
                        break;
                    case Constants.FOOD:
                        Tours = FoodMenu.RunFoodMenu(Tours);
                        break;
                    case Constants.TRANSPORT:
                        Tours = TransportMenu.RunTransportMenu(Tours);
                        break;
                    case Constants.EXIT:
                      return Tours;
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                }
            }
    }
}
