package utils;

import beans.Tour;
import beans.YourTravel;
import java.util.List;

class DeleteTour {
    static YourTravel DelitingTour(YourTravel Tours) {
        List<Tour> tours = Tours.getTours();
        System.out.print("Введите номер тура, который вы хотите удалить: ");
        int number = Keyboard.InputNumber();
        Tours.getTours().remove(tours.get(number-1));
        return Tours;
    }
}
