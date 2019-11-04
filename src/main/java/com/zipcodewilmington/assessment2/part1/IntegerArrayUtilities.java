package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        Integer [] range1 = new Integer[stop - start +1];
        for(int i = 0; start < stop + 1; i++)  {
            range1[i] = start;
            start++;
            }
        return range1;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length-1] * array[array.length - 2];
    }
}
