package utils.sort.food;

import beans.Food;
import beans.Tour;
import beans.YourTravel;
import utils.Constants;
import utils.Keyboard;
import utils.PrintTourList;
import utils.ToursList;

import java.util.Iterator;
import java.util.List;

public class SortByFullBoard {
    public static YourTravel SortingByFullBoard(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            Iterator<Tour> iter = list.iterator();
            while (iter.hasNext()) {
                Tour next = iter.next();
                if (next.getFood().equals(Food.None) ||
                        next.getFood().equals(Food.FullBoardPlus) ||
                        next.getFood().equals(Food.AllInclusive) ||
                        next.getFood().equals(Food.AllInclusivePremium) ||
                        next.getFood().equals(Food.UltraAllInclusive))
                    iter.remove();
            }
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            if (number == Constants.EXIT) {
                break;/*!!!!!!!!!!!!!!!!!!!!!!*/
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
