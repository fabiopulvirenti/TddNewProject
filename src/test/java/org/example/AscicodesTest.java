package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscicodesTest {

    @Test
    @DisplayName("this method will count the Ascii codes")
    void TestCalculateAscii(){
        Ascicodes asci =new Ascicodes();

        int result= asci.calculateAsci("northcoders");
        int result2= asci.calculateAsci("Northcoders");
        int result3= asci.calculateAsci("a");


        assertEquals(1195,result);
        assertEquals(1163,result2);
        assertEquals(97,result3);
    }

}