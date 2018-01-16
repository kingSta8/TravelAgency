/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import beans.YourTravel;
import utils.*;
import utils.sort.type.*;

public class TypeMenu extends Menu {
    public static YourTravel RunTypeMenu(YourTravel Tours) {
        System.out.println();
        System.out.println("Выберите тип тура.");
        System.out.println("1. Отдых.");
        System.out.println("2. Экскурсии.");
        System.out.println("3. Лечение.");
        System.out.println("4. Шоппинг.");
        System.out.println("5. Круиз.");
        PrintMenuConstants();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.REST:
                        Tours = SortByRest.SortingByRest(Tours);
                        break;
                    case Constants.EXCURSION:
                        SortByExcursion.SortingByExcursion(Tours);
                        break;
                    case Constants.TREATMENT:
                        SortByTreatment.SortingByTreatment(Tours);
                        break;
                    case Constants.SHOPPING:
                        SortByShopping.SortingByShopping(Tours);
                        break;
                    case Constants.CRUISE:
                        SortByCruise.SortingByCruise(Tours);
                        break;
                    case Constants.EXIT:
                        Tours = SortTour.SortingTour(Tours);
                         /*!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                }
            }
    }
}
