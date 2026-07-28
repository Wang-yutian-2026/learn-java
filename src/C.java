class  A{
    public A(int num){
        System.out.println("A类 带参构造器执行，传入参数："+num);
    }
}

class B{
    public B(String msg){
        System.out.println("B类 带参构造器执行,传入参数："+msg);
    }
}

public class C extends A{
    private B b;

    public C(){
        super(100);
        b=new B("C内部构造初始化B对象");
    }

    public static void main(String[] args){
        new C();
    }
}
