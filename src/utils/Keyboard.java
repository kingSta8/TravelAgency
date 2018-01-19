/*
*Project TravelAgency
* @version 1.0
* @date December2017
* @author George Stahovsky
*/
package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Keyboard {
    public static String InputNumber(){
        Scanner in = new Scanner(System.in);
        String command;
        while (true) {
        command = in.next();
        if (reg(command)) {
            return command;
        }
        else {
            System.out.println(Constants.REPEAT_MESSAGE);
            System.out.print(Constants.CHOSE_COMMAND);
        }
        }
    }

    private static boolean reg(String S) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(S);
        return m.matches();
    }

}

