package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    @DisplayName("this method will sum some numbers in an array")
    void testSumAllNumber(){
        Kata kata=new Kata();
        int result = kata.sumAllTheNumber(new int[]{5,2,6,10,22});
        int result2 = kata.sumAllTheNumber(new int[]{1,2,3,4,5});
        int result3 = kata.sumAllTheNumber(new int[]{1});
        int result4 = kata.sumAllTheNumber(new int[]{5,2,6,10,22});
        int result5 = kata.sumAllTheNumber(new int[]{1,2});



        assertEquals(21,result);
        assertEquals(9,result2);
        assertEquals(0,result3);
        assertEquals(0,result5);


    }


}