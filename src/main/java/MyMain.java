public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double mean = 0.0;
        int ave = 0;
        double[] row0 = mat[0];
        for (int i = 0; i < row0.length; i++){
            for (int j = 0; j < row0.length; j++){
                mean = mean + mat[i][j]; 
                ave = ave + 1;
            }
        }
        return (mean/ave);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
