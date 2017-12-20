/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package beans;

import java.util.List;
import java.util.ArrayList;

public class YourTravel {
    private String name;
    private int numberOfTours;
    private List<Tour> tours = new ArrayList<Tour>();

    public YourTravel(String name, int numberOfTours, List<Tour> tours) {
        super();
        this.name = name;
        this.numberOfTours = numberOfTours;
        this.tours = tours;
    }

    public YourTravel () {
    }

    @Override
    public String toString() {
        return "Tour [name=" + name + ", numberOfTours=" + numberOfTours + ", tours=" + tours + "]";
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTours() {
        return numberOfTours;
    }

    public void setNumberOfTours(int numberOfTours) {
        this.numberOfTours = numberOfTours;
    }

    public List<Tour> getTours() {
        return tours;
    }
}
