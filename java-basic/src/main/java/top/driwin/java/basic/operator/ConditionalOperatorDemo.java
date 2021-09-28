package top.driwin.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = ( a == 1 ) ? 20:30;
        log.info ("Value if b is :" + b);
        b = ( a == 10 ) ? 20:30;
        log.info ("Value if b is :" + b);
    }
}
