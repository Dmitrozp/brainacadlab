package com.brainacad.laba18;

public class StackOverFlowTest {

    static int count;

    static void test() throws StackOverflowError {
        for (int i = 1; i>0; i++){
            System.out.println("count =" + count++);
            test();
        }
    }
}
