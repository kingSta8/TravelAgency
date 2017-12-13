/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package beans;

import utils.Food;
import utils.Transport;
import utils.Type;

public class Tour {

    private String name;
    private Type type;
    private int days;
    private Food food;
    private Transport transport;

    public Tour(String name, Type type, int days, Food food, Transport transport) {
        super();
        this.name = name;
        this.type = type;
        this.days = days;
        this.food = food;
        this.transport = transport;
    }

    public Tour() {

    }

    @Override
    public String toString() {
        return "Tour [name=" + name + ", type=" + type + ", days=" + days + ", food=" + food + ", transport=" + transport + "]";
    }

}
