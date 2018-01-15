package utils.menus;

import beans.YourTravel;
import utils.*;

public class TransportMenu {
    public static YourTravel RunTransportMenu(YourTravel Tours) {

        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            System.out.println("Выберите транспорт.");
            System.out.println("1. Автобус");
            System.out.println("2. Самолет");
            System.out.println("3. Поезд");
            System.out.println("4. Лайнер");
            System.out.println(Constants.PREVIOUS_MENU);
            System.out.print(Constants.CHOSE_COMMAND);

            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.BUS:
                        SortByBus.SortingByBus(Tours);
                        break;
                    case Constants.PLANE:
                        SortByPlane.SortingByPlane(Tours);
                    case Constants.TRAIN:
                        SortByTrain.SortingByTrain(Tours);
                    case Constants.LINER:
                        SortByLiner.SortingByLiner(Tours);
                    case Constants.EXIT:
                        return Tours;/*!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
                    default:
                        System.out.println(Constants.REPEAT_MESSAGE);
                }
                if (number == Constants.EXIT) {
                    break;
                }
            }
        }
        return Tours;
    }
}
