package top.driwin.java.basic;


import top.driwin.java.basic.array.ArrayDemo;


/*
 * @Description : App
 * @author : driwin
 * @date : 2021/9/24
 */
public class App {
    public static void main(String[] args){
        System.out.println("app launch");
        int[] arr={1,2,3,4,5};
        ArrayDemo ad = new ArrayDemo();
        int sum = ad.getSum(arr);
        System.out.println("sum ="+ sum);
    }
}
