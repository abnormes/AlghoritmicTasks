package ru.abnormes.zero_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithZerosImpl implements ArrayWithZeros {

    private int step;
    private List<Integer> array;

    @Override
    public void modify(List<Integer> array) {

        this.array = array;

        for (step = 0; step < array.size(); ++step) {
            if (array.get(step).equals(0)) {
                shiftArray();
            }
        }
    }

    private void shiftArray() {
        int length = array.size() - 1;

        for (int i = length; i > step + 1; --i) {
            array.set(i, array.get(i - 1));
        }

        array.set(step + 1, 0);
        ++step;
    }
}
