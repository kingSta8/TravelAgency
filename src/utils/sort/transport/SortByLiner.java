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

public class SortByLiner {
    public static YourTravel SortingByLiner(YourTravel Tours) {
        List<Tour> list = ToursList.fillToursList();
        String key;
        while (true) {
            System.out.println();
            System.out.println(Constants.YOUR_CRITERION);
            list.removeIf(next -> next.getTransport().equals(Transport.автобус) ||
                    next.getTransport().equals(Transport.самолет) ||
                    next.getTransport().equals(Transport.поезд));
            PrintTourList.printTourList(list);
            System.out.println(Constants.RETURN_MESSAGE);
            System.out.print(Constants.CHOSE_TOUR);
            key = Keyboard.InputNumber();
            int number = Integer.parseInt(key);
            if (number == 0) {
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
