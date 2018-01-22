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
import utils.Constants;
import utils.Keyboard;
import utils.PrintTourList;
import utils.ToursList;
import utils.menus.text.TyPeMenu;

import java.util.List;

public class SortByShopping {
    public static YourTravel SortingByShopping(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        String key;
        while (true) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            list.removeIf(next -> next.getType().equals(Type.круиз) ||
                                  next.getType().equals(Type.лечение) ||
                                  next.getType().equals(Type.экскурсия) ||
                                  next.getType().equals(Type.отдых));
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            key = Keyboard.InputNumber();
            int number = Integer.parseInt(key);
            if (number == 0) {
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
