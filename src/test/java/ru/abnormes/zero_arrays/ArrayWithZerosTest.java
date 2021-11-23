package ru.abnormes.zero_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.abnormes.zero_array.ArrayWithZeros;
import ru.abnormes.zero_array.ArrayWithZerosImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayWithZerosTest {

    @Test
    @DisplayName("Test from description number one")
    void modifyTestOne() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayWithZeros test = new ArrayWithZerosImpl();

        test.modify(numberList);

        List<Integer> integers = Arrays.asList(1, 2, 3);
        Assertions.assertIterableEquals(numberList, integers);
    }

    @Test
    @DisplayName("Test from description number two")
    void modifyTestTwo() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,0,2,3,0,4,5,0));
        ArrayWithZeros test = new ArrayWithZerosImpl();

        test.modify(numberList);

        List<Integer> integers = Arrays.asList(1,0,0,2,3,0,0,4);
        Assertions.assertIterableEquals(numberList, integers);
    }

    @Test
    @DisplayName("Test from description number three")
    void modifyTestThree() {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(0,1,2,3,0,4,5,0));
        ArrayWithZeros test = new ArrayWithZerosImpl();

        test.modify(numberList);

        List<Integer> integers = Arrays.asList(0,0,1,2,3,0,0,4);
        Assertions.assertIterableEquals(numberList, integers);
    }
}
