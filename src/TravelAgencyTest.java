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
                TourMenu.RunTourMenu();
                break;
            case Constants.SORT_TOUR:
                /*Tours = SortTour.sortTour(Tours);*/
                break;
            case Constants.SHOW_CHOICE:
                /**/
            case Constants.EXIT:
                System.out.println(Constants.GOOD_BYE_MESSAGE);
                System.exit(0);
                break;
        }
    }
}
