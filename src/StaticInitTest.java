public class StaticInitTest {
    public static String str1 = "直接在声明赋值的静态字符串";

    public static String str2;

    static {
        System.out.println("=====静态代码快执行");
        str2 = "静态代码块中赋值的静态字符串";
    }

    public static void printStaticValue(){
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
    }

    public static void main(String[] args){
        System.out.println("main方法开始执行");
        StaticInitTest.printStaticValue();
    }
}
