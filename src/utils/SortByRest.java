/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import beans.Tour;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByRest {
    public static void SortingByRest(List<Tour> list) {
        Collections.sort(list, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return 0;
            }
        });
    }
}
