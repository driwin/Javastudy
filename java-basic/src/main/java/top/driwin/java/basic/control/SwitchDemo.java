package top.driwin.java.basic.control;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchDemo {
    public static void main(String[] args){
        int i = 0;
        int j = -1;
        switch (i){
            case 0:
                j=1;
            case 1:
                j=1;
            case 2:
                j=2;
        }
        log.info("j={}",j);
    }
}
