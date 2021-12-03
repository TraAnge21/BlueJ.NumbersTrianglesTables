 

public class
TriangleUtilities {

    public static String getRow(int numberOfStars) {

        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = 0; num < numberOfStars; num++) {
            string =string + "*";
        }
        return string;

    }
    
    public static String getTriangle(int numberOfRows) {
        // initialise the string
        String string = "";
        // a loop to return all integers way up to the stop but not include the stop
        for (int num = 1; num <= numberOfRows; num++) {
            string +=getRow(num) + "\n";
        }
        return string;

    }


    public static String getSmallTriangle() {


        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }
}
