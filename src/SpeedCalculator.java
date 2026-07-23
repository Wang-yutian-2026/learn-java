public class SpeedCalculator {
    public static void main(String[] args){
        final double Distance = 100.0;
        final double Time = 9.58;

        double speed = Distance/Time;

        System.out.println("距离："+Distance+"米");
        System.out.println("时间："+Time+"秒");
        System.out.println("----------");
        System.out.printf("计算出的速度为%.2f米/秒\n",speed);
    }
}
