package com.kannan.recursion;

public class GfG {

    static int recLen(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "Geeks";
        System.out.println(recLen(str));
    }
}