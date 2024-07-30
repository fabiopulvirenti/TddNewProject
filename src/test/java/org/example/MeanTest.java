package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanTest {

    @Test
    @DisplayName("this method will return the mean of an array")
    void TestCalculateMean(){

        Mean mean = new Mean();

        double result=mean.calculateMean(new int[]{1,2,3});
        double result2=mean.calculateMean(new int[]{40,16,5,8});

        assertEquals(2,result);
        assertEquals(17.25,result2);


    }




}