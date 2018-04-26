package com.company;

public class Box {
    private int a[];
    private  int error_code;
    public int length;

    Box(int length, int error_code){
        this.length = length;
        this.error_code =error_code;
        a= new int[length];
    }
    private  boolean matches(int index){
        if ((index>=0)&&(index<length))
        {
            return true;
        }
        return false;
    }



    public boolean push(int index,int value){
        if (matches(index)) {
            a [index] = value;
            return true;
        }
        return false;
    }

    public int get(int index){
        if (matches(index)){
            return  a[index];
        }
        return  error_code;
    }
}