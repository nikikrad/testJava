package com.company;

public class Array implements Interface{
    int a[] = new int[5];
    int size = 0;

    @Override
    public int Get(int i){
        return a[i];
    }
    @Override
    public boolean Add(int val){
        if (size != a.length){
            a[size] = val;
            return true;
        }else
            return false;
    }
}
