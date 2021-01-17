//worked with Rasika
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
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < row0.length; j++){
                allNums[numberNums] = mat[i][j];
                numberNums++;
            }
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
        double[] row0 = mat[0];
        double[] allNums = new double[row0.length * mat.length];
        int numberNums = 0;
        double med = 0.0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < row0.length; j++){
                allNums[numberNums] = mat[i][j];
                numberNums++;
            }
        }
        int largeC = 0;
        double mode = 0.0;
        for (int i = 0; i < allNums.length; i++){
            int counter = 0;
            for (int j = 0; j < allNums.length; j++){
                if (allNums[j] == allNums[i]){
                    counter++;
                }
            }
            if (counter > largeC){
                largeC = counter;
                mode = allNums[i];
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        double[][] m4 = {
        {1,  2,  2,  2,  6},
        {7,  9,  10, 11, 11},
        {11, 11, 17, 18, 20}
        };
        System.out.println(mean(m4));
        System.out.println(median(m4));
        System.out.println(mode(m4));
    }
}
