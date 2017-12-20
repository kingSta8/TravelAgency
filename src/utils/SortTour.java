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
            TypeMenu.PrintTypeMenu();


            /*while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.REST:

                        break;
                    case Constants.EXCURSION:

                        break;
                    case Constants.TREATMENT:

                        break;
                    case Constants.SHOPPING:

                        break;
                    case Constants.CRUISE:

                        break;
                    case Constants.EXIT:

                        break;
                }
            }*/


        }
        return Tours;
    }
}
