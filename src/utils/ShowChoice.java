package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.List;

public class ShowChoice {
    public static YourTravel ShowingChoice(YourTravel Tours) {
        System.out.println();
        System.out.println("Туры ");
        if (Tours.getNumberOfTours() != 0) {
           List<Tour> tours = Tours.getTours();
           PrintTourList.printTourList(tours);
            System.out.println("были выбраны Вами.");
            System.out.println();
        }
        if (Tours.getNumberOfTours() == 0) {
            System.out.print("не были выбраны Вами. Пожалуйста, выберите интересующий вас тур.");
            System.out.println();
        }
        return Tours;
    }
}