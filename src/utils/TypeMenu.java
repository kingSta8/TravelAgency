/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;

import java.util.List;

public class TypeMenu {
    public static void RunTypeMenu() {
        System.out.println("Выберите тип тура.");
        System.out.println("1. Отдых.");
        System.out.println("2. Экскурсии.");
        System.out.println("3. Лечение.");
        System.out.println("4. Шоппинг.");
        System.out.println("5. Круиз.");
        System.out.println("0. Вернуться к предыдущему меню.");
        System.out.print("Выберите команду: ");

        List<Tour> list = ToursList.fillToursList();

        while (true) {
            switch (Keyboard.InputNumber()) {
                case Constants.REST:
                    SortByRest.SortingByRest(list);
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
        }
    }
}
