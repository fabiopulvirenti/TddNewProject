package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikesdislikesTest {


    @Test
    @DisplayName("this method will return a button")
    void TestPressTheButton(){
        Likesdislikes like =new Likesdislikes();


        String result= like.pressTheButton(new String[]{"LIKE", "DISLIKE"});
        String result2= like.pressTheButton(new String[]{"LIKE"});
        String result3= like.pressTheButton(new String[]{"DISLIKE", "DISLIKE"});



        assertEquals("NEUTRAL",result);
        assertEquals("LIKE",result2);
        assertEquals("NEUTRAL",result3);
    }
}

