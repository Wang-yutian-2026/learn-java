class Demo{
    public Demo(){
        System.out.println("Demo对象被惰性初始化创建了");
    }

    public void show(){
        System.out.println("调用Demo类的业务方法");
    }
}

public class LazyTest {
    private Demo demo;

    public Demo getDemo(){
        if (demo == null){
            demo = new Demo();
        }
        return demo;
    }
    public static void main(String[] args){
        LazyTest test = new LazyTest();
        System.out.println("=== 还未调用getDemo，对象未创建 ===");

        Demo obj = test.getDemo();
        obj.show();

        test.getDemo().show();
    }
}
