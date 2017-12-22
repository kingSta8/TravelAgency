/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;

import java.util.Iterator;
import java.util.List;

public class SortByRest {
    public static void SortingByRest(List<Tour> list) {
        list = ToursList.fillToursList();
        Iterator<Tour> iter = list.iterator();
        while (iter.hasNext()) {
            Tour next = iter.next();
            if (next.getType().equals(Type.круиз) || next.getType().equals(Type.шоппинг) || next.getType().equals(Type.лечение) || next.getType().equals(Type.экскурсия)) iter.remove();
        }
        PrintTourList.printTourList(list);
        
    }
}
