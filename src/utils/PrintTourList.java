/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import utils.ToursList;
import beans.Tour;
import java.util.List;

public class PrintTourList {
    public static void printTourList(List<Tour> list) {
        for (int i=0; i<list.size(); i++) {
            System.out.print((i+1) + ". ");
            if (i<9) System.out.print(" ");
            System.out.print("'" + list.get(i).getName() + "' (");
            System.out.print("тип: " + list.get(i).getType()+ ", ");
            System.out.print("количество дней: " + list.get(i).getDays() + ", ");
            System.out.print("тип питания: " + list.get(i).getFood() + ", ");
            System.out.print("транспорт: " + list.get(i).getTransport() + ")");
            System.out.println();
        }
    }
}
