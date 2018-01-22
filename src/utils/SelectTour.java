/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.List;

public class SelectTour {

    private static final String TOUR_LIST = "Список предлагаемых туров.";

    /**
     * Offers selecting tour from the list and add it to the collection.
     * @param Tours current collection
     * @return edited collection
     */
    public static YourTravel SelectingTour(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        String key;
        while (true) {
            System.out.println();
            System.out.println(TOUR_LIST);
            PrintTourList.printTourList(list);
            System.out.println();
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            key = Keyboard.InputNumber();
            int number = Integer.parseInt(key);
            System.out.println();
            if (number == 0) {
                break;
            }
            if (number < 1 || number - 1 >= list.size() ) {
                System.out.print(Constants.REPEAT_MESSAGE);
                continue;
            }
            Tours.getTours().add(list.get(number-1));
            Tours.setNumberOfTours(Tours.getNumberOfTours() + 1);
            System.out.println("Тур " + "\"" +list.get(number - 1).getName() + "\" " +"добавлен.");
        }
        return Tours;
    }
}
