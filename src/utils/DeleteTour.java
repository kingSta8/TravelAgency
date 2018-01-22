package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.List;

class DeleteTour {
    static YourTravel DeletingTour(YourTravel Tours) {
        List<Tour> tours = Tours.getTours();
        System.out.print("Введите номер тура, который вы хотите удалить: ");
        String key = Keyboard.InputNumber();
        int number = Integer.parseInt(key);
        Tours.getTours().remove(tours.get(number-1));
        return Tours;
    }
}
