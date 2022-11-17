package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution<ArrayList<SomeClass<Integer>>> solution = new Solution<>();
        System.out.println(solution.getList().toString());
    }
}