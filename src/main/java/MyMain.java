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
        double[] row0 = mat[0];
        double[] allNums = new double[row0.length * mat.length];
        int numberNums = 0;
        double med = 0.0;
        for (int i = 0; i < row0.length; i++){
            for (int j = 0; j < row0.length; i++){
                allNums[numberNums] = mat[i][j];
                numberNums++;
            }
        System.out.println(numberNums);
        System.out.println();
        }
        if(numberNums % 2 == 1){
		    med = allNums[((numberNums + 1) / 2) - 1];
	    }
	    else{
		    med = (allNums[(numberNums / 2)-1] + allNums[numberNums / 2]) / 2;
	    }
        return med;
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
