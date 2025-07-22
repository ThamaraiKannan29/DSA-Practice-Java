package com.kannan.customerDataStructure;

public class CustomStack {
    private int[] data;
    private int size = 0;
    private static final int DEFAULT_SIZE = 5;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public int pop() {
        return data[--size];
    }

    public int peek() {
        return data[size - 1];
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1)
                sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

    public void push(int value) {
        if (data.length == size) {
            resize();
        }
        data[size++] = value;
    }

    public boolean empty() {
        return size <= 0;
    }


    private void resize() {
        int[] temp = new int[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

}
