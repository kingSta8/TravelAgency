/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import java.util.List;
import beans.Tour;
import utils.Keyboard;


public class SelectTour {
    public static void SelectingTour() {

        List<Tour> list = ToursList.fillToursList();

        System.out.println();
        System.out.println("Список предлагаемых туров.");
        PrintTourList.printTourList(list);
        System.out.println();

        int number = -1;
        do {
            System.out.println("Для возврата в предыдущее меню ниже введите 0.");
            System.out.println("Выберите интересующий вас тур: ");
            number = Keyboard.InputNumber();

        } while (number != Constants.EXIT);
    }
}
