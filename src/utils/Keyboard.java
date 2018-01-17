/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import java.util.Scanner;

public class Keyboard {
    public static int InputNumber(){
        Scanner in = new Scanner(System.in);
        int command;
        command = in.nextInt();
        return command;
    }
}
