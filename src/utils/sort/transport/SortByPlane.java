/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.sort.transport;

import beans.Tour;
import beans.Transport;
import beans.YourTravel;
import utils.Constants;
import utils.Keyboard;
import utils.PrintTourList;
import utils.ToursList;
import utils.menus.text.TransPortMenu;
import java.util.List;

public class SortByPlane {
    public static YourTravel SortingByPlane(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        int number;
        while (true) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            list.removeIf(next -> next.getTransport().equals(Transport.автобус) ||
                    next.getTransport().equals(Transport.поезд) ||
                    next.getTransport().equals(Transport.лайнер));
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            number = Keyboard.InputNumber();
            if (number == Constants.EXIT) {
                System.out.println();
                TransPortMenu.PrintTransportMEnu();
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
