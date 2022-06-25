package com.company;

import java.util.ArrayList;
import java.util.List;

public class testing {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            test.add(0,i);
        }
        System.out.println(test);
    }
}
