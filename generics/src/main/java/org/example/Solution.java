package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution <T extends List<SomeClass<Integer>>>{
    public T getList(){
        T t = (T) new ArrayList<SomeClass<Integer>>();
        t.add(new SomeClass<>(23));
        t.add(new SomeClass<>(546));
        return t;
    }
}
