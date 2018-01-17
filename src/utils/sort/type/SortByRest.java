/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.sort.type;

import beans.Tour;
import beans.Type;
import beans.YourTravel;
import utils.*;
import utils.menus.text.TyPeMenu;
import java.util.List;

public class SortByRest {
    public static YourTravel SortingByRest(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number;
        while (true) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            list.removeIf(next -> next.getType().equals(Type.круиз) ||
                                  next.getType().equals(Type.шоппинг) ||
                                  next.getType().equals(Type.лечение) ||
                                  next.getType().equals(Type.экскурсия));
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            if (number == Constants.EXIT) {
                System.out.println();
                TyPeMenu.PrintTypeMenu();
                break;
            }
            if (number < 1 || number - 1 >= list.size() ) {
                System.out.println(Constants.REPEAT_MESSAGE);
                continue;
            }
            Tours.getTours().add(list.get(number-1));
            Tours.setNumberOfTours(Tours.getNumberOfTours() + 1);
            System.out.println("Тур " + "\"" + list.get(number - 1).getName() + "\" " + "добавлен.");
        }
        return Tours;
    }
}
