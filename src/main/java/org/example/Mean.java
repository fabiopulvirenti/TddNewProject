package org.example;

public class Mean {

    public double calculateMean(int [] input ){

        double sum=0;

        for(int i=0;i <input.length;i++){
            sum=sum + input[i];
        }

        double result=(double) (sum/input.length);


        return result;
    }


}
