package packageb;
import packagea.Parent;

public class TestOutside {
    public static void main(String[] args){
        Parent p = new Parent();
        //报错：不同包的无关类，不能访问protected方法
       // p.showProtected();
    }
}
