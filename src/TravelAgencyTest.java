/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
import utils.*;


public class TravelAgencyTest {

    public static void main(String[] args) {
        System.out.println(Constants.HELLO_MESSAGE);
        System.out.println(Constants.HELLO_MESSAGE2);

        MainMenu.PrintMainMenu();
        switch (Keyboard.InputNumber()) {
            case Constants.SELECT_TOUR:

                break;
            case Constants.SORT_TOUR:

                break;
            case Constants.EXIT:
                System.out.println("До свидания! Хорошего дня!");
                System.exit(0);
                break;
        }
    }
}
