package utils.menus;

import beans.YourTravel;
import utils.*;

public class DaysMenu extends Menu {
    public static YourTravel RunDaysMenu(YourTravel Tours) {
        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            System.out.println("Выберите количество дней.");
            System.out.println("1. 1-9");
            System.out.println("2. 10-20");
            System.out.println("3. 20+");
            PrintMenuConstants();
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.ONE_NINE:
                        SortByOneNine.SortingByOneNine(Tours);
                        break;
                    case Constants.TEN_TWENTY:
                        SortByTenTwenty.SortingByTenTwenty(Tours);
                        break;
                    case Constants.TWENTY_PLUS:
                        SortByTwentyPlus.SortingByTwentyPlus(Tours);
                        break;
                    case Constants.EXIT:
                        break;
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
