class Engine{
    public void start() {}    // 启动
    public void rev() {}      // 转速拉高
    public void stop() {}     // 熄火

    public void service(){
        System.out.println("发动机正在进行保养 service()");
    }
}

class Wheel {
    public void inflate(int psi) {} // 给轮胎充气，psi气压值
}

class Window {
    public void rollup() {}   // 升窗
    public void rolldown() {} // 降窗
}

class Door {
    // 车门里面包含一个车窗对象（嵌套组合）
    public Window window = new Window();
    public void open() {}  // 开门
    public void close() {} // 关门
}

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
        left = new Door(),
        right = new Door();
    public Car(){
        for (int i = 0;i<4;i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args){
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);

        car.engine.service();
    }
}