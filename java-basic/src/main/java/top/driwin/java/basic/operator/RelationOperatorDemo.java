package top.driwin.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class RelationOperatorDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        log.info ("x == y = " + (x == y));
        log.info ("x != y = " + (x != y));
        log.info ("x > y = " + (x > y));
        log.info ("x < y = " + (x < y));
        log.info ("x >= y = " + (x >= y));
        log.info ("x <= y = " + (x <= y));
    }
}
