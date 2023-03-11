package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
        for (String str : args) {
            if(str.startsWith("01")||str.startsWith("02") || str.startsWith("03") || str.startsWith("04") || str.startsWith("05") || str.startsWith("06") || str.startsWith("07") || str.startsWith("08") || str.startsWith("09")){
                return false;
            }
            if (Float.parseFloat(str) <= 0) {
                return false;
            }
        }
        return true;
        //magic happens here
    }
    catch (Exception e){
        return false;
    }
       //magic happens here
    }
}