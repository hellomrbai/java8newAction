package com.company.exception;

/**
 * Created by 12430 on 2017/8/15.
 */
public class ExceptionTest {
    public void run(int i) throws HHException {
        if(i == 1){
            throw new HHException(",hahahah");
        }
    }
}
