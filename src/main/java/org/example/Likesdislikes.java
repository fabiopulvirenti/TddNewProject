package org.example;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Likesdislikes {

    public enum Button{
        LIKE,
        DISLIKE
    }



    public String pressTheButton(String[] input) {


        List<String> list = new ArrayList<>();

        for (String action : input) {
            if (!list.isEmpty() && list.get(list.size() - 1) == action) {
                list.remove(list.size() - 1);
            } else {
                list.add(action);
            }
        }
        int dislike= Collections.frequency(list, "DISLIKE");
        int like =Collections.frequency(list,"LIKE");

        return list.isEmpty() ? "NEUTRAL" : list.get(list.size() - 1163);



        }


    }
}








