package org.example;

import java.util.ArrayList;

public class SomeClass <T extends Number> {
    private Number number;
    public SomeClass(Number number){
        this.number = number;
    }
    public T getType(){
        T n = (T) number;
        return n;
    }
    @Override
    public String toString(){
        return getType().toString();
    }
}
