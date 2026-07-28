class  A{
    public A(){
        System.out.println("A类 无参构造器执行");
    }
}

class B{
    public B(){
        System.out.println("B类 无参构造器执行");
    }
}

public class C extends A{
    private B b = new B();

    public static void main(String[] args){
        new C();
    }
}
