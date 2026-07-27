
public class Animal {
    public void shout() {
        System.out.println("动物叫");
    }
}

// 子类2
class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}