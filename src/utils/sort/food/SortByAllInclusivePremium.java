/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.sort.food;

import beans.Food;
import beans.Tour;
import beans.YourTravel;
import utils.Constants;
import utils.Keyboard;
import utils.PrintTourList;
import utils.ToursList;
import utils.menus.text.FoOdMenu;

import java.util.List;

public class SortByAllInclusivePremium {
    public static YourTravel SortingByAllInclusivePremium(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number;
        while (true) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            list.removeIf(next -> next.getFood().equals(Food.FullBoard) ||
                    next.getFood().equals(Food.None) ||
                    next.getFood().equals(Food.FullBoardPlus) ||
                    next.getFood().equals(Food.AllInclusive) ||
                    next.getFood().equals(Food.UltraAllInclusive));
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            if (number == Constants.EXIT) {
                System.out.println();
                FoOdMenu.PrintFoodMenu();
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
