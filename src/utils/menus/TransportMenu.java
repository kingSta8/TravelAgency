/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils.menus;

import beans.YourTravel;
import utils.*;
import utils.menus.text.SortingMenu;
import utils.menus.text.TransPortMenu;
import utils.sort.transport.SortByBus;
import utils.sort.transport.SortByLiner;
import utils.sort.transport.SortByPlane;
import utils.sort.transport.SortByTrain;

public class TransportMenu extends Menu {
    /**
     * Displays the transport menu.
     * @param Tours current collection
     * @return edited collection
     */
    public static YourTravel RunTransportMenu(YourTravel Tours) {
            System.out.println();
            TransPortMenu.PrintTransportMEnu();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.BUS:
                        Tours = SortByBus.SortingByBus(Tours);
                        break;
                    case Constants.PLANE:
                        Tours = SortByPlane.SortingByPlane(Tours);
                        break;
                    case Constants.TRAIN:
                        Tours = SortByTrain.SortingByTrain(Tours);
                        break;
                    case Constants.LINER:
                        Tours = SortByLiner.SortingByLiner(Tours);
                        break;
                    case Constants.EXIT:
                        System.out.println();
                        SortingMenu.PrintSortingMenu();
                        return Tours;
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                        System.out.print(Constants.CHOSE_COMMAND);
                }
            }
    }
}