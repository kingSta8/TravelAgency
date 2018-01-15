/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
import beans.*;
import utils.*;
import utils.menus.MainMenu;
import utils.SortTour;

import java.util.ArrayList;
import java.util.List;

public class TravelAgencyTest {

    public static void main(String[] args) {
        System.out.println(Constants.HELLO_MESSAGE);

        List<Tour> Travel = new ArrayList<Tour>();
        YourTravel Tours = new YourTravel("ChosenTours", 0, Travel);

        while (true) {
            System.out.println();
            System.out.println(Constants.HELLO_MESSAGE2);
            MainMenu.PrintMainMenu();
            switch (Keyboard.InputNumber()) {
                case Constants.SELECT_TOUR:
                    Tours = SelectTour.SelectingTour(Tours);
                    break;
                case Constants.SORT_TOUR:
                    Tours = SortTour.SortingTour(Tours);
                    break;
                case Constants.SHOW_CHOICE:
                    Tours = ShowChoice.ShowingChoice(Tours);
                    break;
                case Constants.EXIT:
                    System.out.println(Constants.GOOD_BYE_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    System.out.println(Constants.REPEAT_MESSAGE);
            }
        }
    }
}
