// Java Code to print a Three-dimensional Array
class Array{
    public static void main(String[] args) {

        // Initializing a 3D array with 2 arrays, each containing 2 rows and 2 columns
        int[][][] arr = {
                { { 1, 2 }, { 3, 4 } },  // First 2D array
                { { 5, 6 }, { 7, 8 } }   // Second 2D array
        };

        // Outer loop iterates over the 2 arrays
        for (int i = 0; i < 2; i++) {

            // Middle loop iterates over the rows in each 2D array
            for (int j = 0; j < 2; j++) {

                // Inner loop iterates over the columns in each row
                for (int k = 0; k < 2; k++) {

                    // Printing each element in the 3D array
                    System.out.print(arr[i][j][k] + " ");
                }

                // New line after printing all columns in a row
                System.out.println();
            }

            // New line after printing all rows in one 2D array
            System.out.println();
        }
    }
}