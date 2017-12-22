/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.Iterator;
import java.util.List;

public class SortByRest {
    public static YourTravel SortingByRest(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number = -1;
        while (number != Constants.EXIT) {
            Iterator<Tour> iter = list.iterator();
            while (iter.hasNext()) {
                Tour next = iter.next();
                if (next.getType().equals(Type.круиз) || next.getType().equals(Type.шоппинг) || next.getType().equals(Type.лечение) || next.getType().equals(Type.экскурсия))
                    iter.remove();
            }
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.println(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            if (number == Constants.EXIT) {
                break;
            }
            if (number < 1 || number - 1 >= list.size() ) {
                System.out.println(Constants.REPEAT_MESSAGE);
                continue;
            }
            Tours.getTours().add(list.get(number-1));
            Tours.setNumberOfTours(Tours.getNumberOfTours() + 1);
            System.out.println("Тур " + "'" + list.get(number - 1).getName() + "' " + "добавлен.");
        }
        return Tours;
    }
}
