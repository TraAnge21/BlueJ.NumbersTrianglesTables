

import java.lang.Math;

public class NumberUtilities {

    public static String getRange(int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = 0; num < stop; num++) {
            string =string + num;
        }
        return string;
    }


    public static String getRange(int start, int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num= start; num < stop; num++) {
            string =string +num;
        }
        return string;


    }


    public static String getRange(int start, int stop, int step) {

        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = start; num < stop; num+=step) {
            string =string +num;
        }
        return string;
    }


    public static String getEvenNumbers(int start, int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = start; num < stop; num++) {
            if ( num %2 == 0) {
                string =string +num;
            }

        }
        return string;

    }



    public static String getOddNumbers(int start, int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = start; num < stop; num++) {
            if ( num %2 != 0) {
                string =string +num;
            }
        }
        return string;


    }



    public static String getExponentiations(int start, int stop, int exponent) {

        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = start; num < stop; num++) {
                int j = (int) (Math.pow(num, exponent));
                string += (int)j ;

        }
        return string;

    }
}
