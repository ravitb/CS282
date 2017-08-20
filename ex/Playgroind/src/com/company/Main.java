package com.company;

public class Main {
    public enum Test {
        test1,
        test2,
        test3
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("IS EQUAL: " + Test.valueOf("2"));
    }
}
