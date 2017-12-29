/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.YourTravel;

public class TypeMenu {
    public static YourTravel RunTypeMenu(YourTravel Tours) {

        int number = -1;
        while (number != Constants.EXIT) {
        System.out.println();
        System.out.println("Выберите тип тура.");
        System.out.println("1. Отдых.");
        System.out.println("2. Экскурсии.");
        System.out.println("3. Лечение.");
        System.out.println("4. Шоппинг.");
        System.out.println("5. Круиз.");
        System.out.println(Constants.PREVIOUS_MENU);
        System.out.print(Constants.CHOSE_COMMAND);

            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.REST:
                        SortByRest.SortingByRest(Tours);
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
                        return Tours;/*!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
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
