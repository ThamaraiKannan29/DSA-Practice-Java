package com.kannan.customerDataStructure;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this(DEFAULT_SIZE);
    }

    public CustomArrayList(int size) {
        data = new int[size];
    }

    public void add(int value) {
        if(data.length == size){
            resize();
        }
        data[size++] = value;
    }

    public int remove(){
        return data[--size];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        if(size==0){
            return "[]";
        }
        StringBuilder sb  = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < size ; i++){
            sb.append(data[i]);
            if(i < size - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for(int i = 0; i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }


}
