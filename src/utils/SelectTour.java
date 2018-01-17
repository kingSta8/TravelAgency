/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import java.util.List;
import beans.Tour;
import beans.YourTravel;

public class SelectTour {

    private static final String TOUR_LIST = "Список предлагаемых туров.";

    public static YourTravel SelectingTour(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number;
        while (true) {
            System.out.println();
            System.out.println(TOUR_LIST);
            PrintTourList.printTourList(list);
            System.out.println();
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            System.out.println();
            if (number == Constants.EXIT) {
                break;
            }
            if (number < 1 || number - 1 >= list.size() ) {
                System.out.println(Constants.REPEAT_MESSAGE);
                continue;
            }
            Tours.getTours().add(list.get(number-1));
            Tours.setNumberOfTours(Tours.getNumberOfTours() + 1);
            System.out.println("Тур " + "\"" +list.get(number - 1).getName() + "\" " +"добавлен.");
        }
        return Tours;
    }
}
