package utils.menus;

import beans.YourTravel;
import utils.*;

public class FoodMenu {
    public static YourTravel RunFoodMenu(YourTravel Tours) {
        int number = -1;
        while (number != Constants.EXIT) {
            System.out.println();
            System.out.println("Выберите тип питания.");
            System.out.println("1. Без питания");
            System.out.println("2. FullBoard");
            System.out.println("3. FullBoardPlus");
            System.out.println("4. AllInclusive");
            System.out.println("5. AllInclusivePremium");
            System.out.println("6. UltraAllInclusive");
            System.out.println(Constants.PREVIOUS_MENU);
            System.out.print(Constants.CHOSE_COMMAND);
            while (true) {
                switch (Keyboard.InputNumber()) {
                    case Constants.NO_FOOD:
                        SortByNoFood.SortingByNoFood(Tours);
                        break;
                    case Constants.FULL_BOARD:
                        SortByFullBoard.SortingByFullBoard(Tours);
                        break;
                    case Constants.FULL_BOARD_PLUS:
                        SortByFullBoardPlus.SortingByFullBoardPlus(Tours);
                        break;
                    case Constants.ALL_INCLUSIVE:
                        SortByAllInclusive.SortingByAllInclusive(Tours);
                        break;
                    case Constants.ALL_INCLUSIVE_PREMIUM:
                        SortByAllInclusivePremium.SortingByAllInclusivePremium(Tours);
                        break;
                    case Constants.ULTRA_ALL_INCLUSIVE:
                        SortByUltraAllInclusive.SortingByUltraAllInclusive(Tours);
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
