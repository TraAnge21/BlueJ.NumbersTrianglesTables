


public class NumberUtilities {

    public static String getRange(int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int k = 0; k < stop; k++) {
            string =string +k;
        }
        return string;
    }


    public static String getRange(int start, int stop) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int k = start; k < stop; k++) {
            string =string +k;
        }
        return string;


    }


    public static String getRange(int start, int stop, int step) {

        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int k = 0; k < stop; k+=step) {
            string =string +k;
        }
        return string;
    }

    public static String getEvenNumbers(int start, int stop) {
        return null;
    }


    public static String getOddNumbers(int start, int stop) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        return null;
    }
}
