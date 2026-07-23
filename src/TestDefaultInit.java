public class TestDefaultInit {
    int num;
    char ch;

    public static void  main(String[] args){
        TestDefaultInit obj = new TestDefaultInit();

        System.out.println("int类型默认值：" + obj.num);
        System.out.println("char类型默认值：["+obj.ch+"]");
        System.out.println("char默认值对应的ASCII码"+(int)obj.ch);
    }
}
