package utils;

import beans.Tour;
import beans.YourTravel;
import java.util.List;

public class ShowChoice {
    public static YourTravel ShowingChoice(YourTravel Tours) {
        System.out.println();

        if (Tours.getNumberOfTours() != 0) {
           List<Tour> tours = Tours.getTours();
           System.out.println("Туры ");
           PrintTourList.printTourList(tours);
           System.out.println("были выбраны Вами.");
           System.out.println();
           System.out.println("Введите 1, если согласны с выбром.");
           System.out.println("Введите 2, если хотите что-то удалить.");
           System.out.print(Constants.CHOSE_COMMAND);
           int key = Keyboard.InputNumber();
            if (key == 2) {
                Tours = DeleteTour.DelitingTour(Tours);
                Tours = ShowingChoice(Tours);
            }
            if (key == 1) {
                System.out.println("Отлично! Удачного путешествия ;)");
            }
        }
        if (Tours.getNumberOfTours() == 0) {
            System.out.print("не были выбраны Вами. Пожалуйста, выберите интересующий вас тур.");
            System.out.println();
        }
        return Tours;
    }
}