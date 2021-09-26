package top.driwin.java.basic.variable;
//import lombok.extern.slf4j.Slf4j;
public class VariableDemo {
    private static int staticVar = 1024;
    private String instanceVar = "hello";

    public void method (){
        int localVar = 666;
        System.out.println("localVar before:" + localVar);
        localVar = 888;
        System.out.println("localVar after: " + localVar);
    }
    public static void main(String[] args){
        System.out.println("staticVar before: " + staticVar);
        staticVar = 2048;
        System.out.println("staticVar after: " + staticVar);
        VariableDemo vd = new VariableDemo();
        System.out.println("instanceVar before: " + vd.instanceVar);
        vd.instanceVar = "world";
        System.out.println("instanceVar after: " + vd.instanceVar);
        vd.method();


    }

}