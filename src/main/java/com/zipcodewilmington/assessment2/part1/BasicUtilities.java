package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return (value >= 5) ? true : false;
    }

    public Boolean isLessThan7(Integer value) {
        return (value <= 7) ? true: false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return isLessThan7(valueToEvaluate) && isGreaterThan5(valueToEvaluate);
    }

    public Boolean startsWith(String string, Character character) {

        boolean startsWith1 = (string.charAt(0) == Character.toLowerCase(character));
        boolean startsWith2 = (string.charAt(0) == Character.toUpperCase(character));



        return startsWith1 || startsWith2;
    }


}
