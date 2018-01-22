package utils;

import beans.Tour;
import beans.YourTravel;

import java.util.List;

class DeleteTour {
    /**
     * Removes a user-selected tour from the collection.
     * @param Tours current collection
     * @return edited collection
     */
    static YourTravel DeletingTour(YourTravel Tours) {
        List<Tour> tours = Tours.getTours();
        System.out.print("Введите номер тура, который вы хотите удалить: ");
        String key = Keyboard.InputNumber();
        int number = Integer.parseInt(key);
        Tours.getTours().remove(tours.get(number-1));
        return Tours;
    }
}
