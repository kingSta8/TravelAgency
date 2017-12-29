package utils;

import beans.YourTravel;

public class DaysMenu {
    public static YourTravel RunDaysMenu(YourTravel Tours) {
        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            System.out.println("Выберите количество дней.");
            System.out.println("1. 1-9");
            System.out.println("2. 10-20");
            System.out.println("3. 20+");
            System.out.println(Constants.PREVIOUS_MENU);
            System.out.print(Constants.CHOSE_COMMAND);
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.ONE_NINE:
                        OneNine.SortingByOneNine(Tours);
                        break;
                    case Constants.TEN_TWENTY:
                        TenTwenty.SortingByTenTwenty(Tours);
                        break;
                    case Constants.TWENTY_PLUS:
                        TwentyPlus.SortingByTwentyPlus(Tours);
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
