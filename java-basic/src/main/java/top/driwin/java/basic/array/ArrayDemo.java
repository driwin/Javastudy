package top.driwin.java.basic.array;

/*
 * @Description : App
 * @author : driwin
 * @date : 2021/9/24
 */
public class ArrayDemo {
    /**
     * 求数组元素之和
     *
     * @param array 整型形参数组
     * @return int:元素之和
     */
public int getSum(int[] array){
    //sum为累加器，初始化为0
    int sum = 0;
    for(int i=0;i<array.length;i++){
        sum+=i;
    }
    return sum;
}
}
