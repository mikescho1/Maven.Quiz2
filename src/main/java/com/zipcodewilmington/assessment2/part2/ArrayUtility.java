package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] array3 = new Integer[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            for (int j = array1.length; j < array3.length; j++) {
                array3[j] = array2[i];
            }
        }

        return array3;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] newArr = new Integer[array.length];


        for (int i = 0; i < array.length; i++) {
            if (i > index - 1) {
                newArr[i - index] = array[i];
            }   if(i < index)   {
                newArr[array.length - (index - i)] = array[i];
            }
        }

        return newArr;
    }



    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
