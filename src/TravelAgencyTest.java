/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
import beans.*;
import utils.*;

import java.util.ArrayList;
import java.util.List;

public class TravelAgencyTest {

    public static void main(String[] args) {
        System.out.println(Constants.HELLO_MESSAGE);
        System.out.println(Constants.HELLO_MESSAGE2);

        List<Tour> Travel = new ArrayList<Tour>();
        YourTravel Tours = new YourTravel("ChosenTours", 0, Travel);

        while (true) {
            MainMenu.PrintMainMenu();
            switch (Keyboard.InputNumber()) {
                case Constants.SELECT_TOUR:
                    Tours = SelectTour.SelectingTour(Tours);
                    break;
                case Constants.SORT_TOUR:
                    Tours = SortTour.SortingTour(Tours);
                    break;
                case Constants.SHOW_CHOICE:
                /*Tours = ShowChoice.ShowingChoice(Tours);*/
                    break;
                case Constants.EXIT:
                    System.out.println(Constants.GOOD_BYE_MESSAGE);
                    System.exit(0);
                    break;
            }
        }
    }
}
