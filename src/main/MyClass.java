package main;

import exception.MyException;

public class MyClass {

    static void myMethod() throws MyException {
        if (true) {
            throw new MyException("error");
        }
    }

    public static void main(String[] args) {

        try {
            myMethod();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("caught");
        }
    }
}
