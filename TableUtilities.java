 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {


        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        String outputTable = "";
        // iteration through row
        for ( int i=1 ; i<= tableSize; i++) {
            // iteration through column
            for ( int j=1 ; j<= tableSize; j++){

                // allocate three spaces to the result of i*j followed by a space and |
                outputTable +=outputTable.format("%3d |",(i*j));
            }
            // new line after each row and column
            outputTable+="\n";
        }

        return outputTable;
    }
}
