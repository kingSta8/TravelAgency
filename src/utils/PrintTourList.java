/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;

import java.util.List;

public class PrintTourList {
    /**
     * Prints list of tours.
     * @param tours
     */
    public static void printTourList(List<Tour> tours) {
        int index = 0;
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

//        for (int i=0; i<tours.size(); i++) {
//            System.out.print((i+1) + ". ");
//            if (i<9) System.out.print(" ");
//            System.out.print("'" + tours.get(i).getName() + "' (");
//            System.out.print("тип: " + tours.get(i).getType()+ ", ");
//            System.out.print("количество дней: " + tours.get(i).getDays() + ", ");
//            System.out.print("тип питания: " + tours.get(i).getFood() + ", ");
//            System.out.print("транспорт: " + tours.get(i).getTransport() + ")");
//            System.out.println();
//        }
    }
}
