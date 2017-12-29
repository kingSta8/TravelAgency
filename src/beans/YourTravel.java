/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YourTravel {
    private String name;
    private int numberOfTours;
    private List<Tour> tours = new ArrayList<Tour>();

}
