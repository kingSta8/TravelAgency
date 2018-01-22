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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Tour {
    private String name;
    private Type type;
    private int days;
    private Food food;
    private Transport transport;
}
