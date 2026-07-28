class Parent{
    public void show(){
        System.out.println("父类重载1：无参数 show()");
    }
    public void show(int a){
        System.out.println("父类重载2：int参数 show(" + a + ")");
    }
    public void show(int a,String b){
        System.out.println("父类重载3：int+String参数 show(" + a + "," + b + ")");
    }
}

public class Child extends Parent{
    public void show(String str){
        System.out.println("子类新增重载4：String参数 show(\" + str + \")");
    }

    public static void main(String[] args){
        Child child = new Child();

        child.show();
        child.show(100);
        child.show(200,"父类重载");
        child.show("子类重载方法");
    }
}
