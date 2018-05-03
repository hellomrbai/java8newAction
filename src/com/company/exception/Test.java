package com.company.exception;

/**
 * Created by 12430 on 2017/8/15.
 */
public class Test {
    public  void tt() throws HHException {
        int i = 1;
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.run(i);
        } catch (HHException e) {
            throw new HHException("eee");
        }
    }

    public static void main(String[] args){
        try {
            new Test().tt();
        } catch (HHException e) {
            System.out.print(e.getMessage());
            e.getMessage();
        }
    }
}
