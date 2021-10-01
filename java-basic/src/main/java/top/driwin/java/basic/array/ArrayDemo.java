package top.driwin.java.basic.array;

/*
 * @Description : App
 * @author : driwin
 * @date : 2021/9/24
 */
public class ArrayDemo {
    public static void main(String[] args){
       char array[][]= new char[4][];
       array[0] = new char[] {'春','眠','不','觉','晓','，'};
       array[1] = new char[] {'处','处','闻','啼','鸟','。'};
       array[2] = new char[] {'夜','来','风','雨','声','，'};
       array[3] = new char[] {'花','落','知','多','少','。'};
    for(int i=0;i<4;i++){
        for(int j=0;j<6;j++)
        {
            System.out.print(array[i][j]);
        }
        System.out.println();
    }
    System.out.print('\n');
    for(int j=0;j<6;j++) {
        for(int i=3;i>=0;i--){
            System.out.print(array[i][j]);
        }
        System.out.print('\n');
    }
        System.out.println();
}
}
