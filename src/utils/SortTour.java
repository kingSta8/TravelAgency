/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.YourTravel;

public class SortTour {
    public static YourTravel SortingTour(YourTravel Tours) {

        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            SortingMenu.PrintSortingMenu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.TYPE:
                        TypeMenu.RunTypeMenu(Tours);
                        break;
                    case Constants.DAYS:
                        DaysMenu.RunDaysMenu(Tours);
                        break;
                    case Constants.FOOD:

                        break;
                    case Constants.TRANSPORT:

                        break;
                    case Constants.EXIT:
                        return Tours;
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                }
                if (number == Constants.EXIT) {
                    break;
                }
            }
        }
        return Tours;
    }
}
