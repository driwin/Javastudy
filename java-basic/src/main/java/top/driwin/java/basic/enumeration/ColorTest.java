package top.driwin.java.basic.enumeration;

import jdk.jfr.Description;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

/**
@Description:颜色枚举测试
**/
@Slf4j
public class ColorTest {
    public static void main(String[] args) {
        Color color = Color.RED;
        log.info(String.valueOf(color));
        Color[] arr = Color.values();
        for (Color c : arr){
            log.info("枚举的索引{}，枚举的值{}",c.ordinal(),c);

        }
    }
}
enum Color{
    RED,
    YELLOW,
    GREEN,
}
