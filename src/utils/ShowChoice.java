package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.ArrayList;
import java.util.List;

public class ShowChoice {
    public static YourTravel ShowingChoice(YourTravel Tours) {
                                  /*
                                  если коллекция содержит какое-то количество, то напечатать
                                  если коллекция содержит 0, то Пожалуйста,попробуйте еще раз
                                  Предыдущее меню*/
        int index = 0;
        System.out.println();
        System.out.println("Туры ");
        if (Tours.getNumberOfTours() != 0) {
           List<Tour> tours = Tours.getTours();
            for (Tour tour : tours) {
                System.out.print((index+1) + ". ");
                if (index < 9) System.out.print(" ");
                System.out.print("\"" + tour.getName() + "\" (");
                System.out.print("тип: " + tour.getType()+ ", ");
                System.out.print("количество дней: " + tour.getDays() + ", ");
                System.out.print("тип питания: " + tour.getFood() + ", ");
                System.out.print("транспорт: " + tour.getTransport() + ")");
                System.out.println();
                index++;
            }
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