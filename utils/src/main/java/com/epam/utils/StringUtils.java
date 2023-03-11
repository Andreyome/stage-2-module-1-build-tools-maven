package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try{
            if(str.startsWith("01")||str.startsWith("02") || str.startsWith("03") || str.startsWith("04") || str.startsWith("05") || str.startsWith("06") || str.startsWith("07") || str.startsWith("08") || str.startsWith("09")){
            return false;
        }
            return Float.parseFloat(str)>0;
        }
        catch(Exception e){
            return false;
        }
        //code!
    }
}
