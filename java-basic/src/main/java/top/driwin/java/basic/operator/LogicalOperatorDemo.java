package top.driwin.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogicalOperatorDemo {
    public static  void  main(String[] args) {
        boolean a = true;
        boolean b = false;

        log.info("a && b = " + (a && b));
        log.info("a || b = " + (a || b));
        log.info("!(a && b) = " + !(a && b));
    }
}
