package top.driwin.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MathOperatorDemo {
    public static void  main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        log.info("a + b =" + (a + b));
        log.info("a - b =" + (a - b));
        log.info("a * b =" + (a * b));
        log.info("a / b =" + (a / b));
        log.info("b % a =" + (b % a));
        log.info("c % a =" + (c % a));
        log.info("a++ =" + (a++));
        log.info("a-- =" + (a--));
        log.info("d++  =" + (d++));
        log.info("++d" + (++d));
    }
}
