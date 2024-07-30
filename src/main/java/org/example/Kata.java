package org.example;

import java.util.Arrays;

public class Kata {

public int sumAllTheNumber(int [] input){

    Arrays.sort(input);
    int result =0;
    for(int i =1;i<input.length-1 ;i++){

        result+=input[i];
    }

    return result;
}



}
