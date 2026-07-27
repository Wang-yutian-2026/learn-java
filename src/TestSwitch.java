public class TestSwitch {
    public static void main(String[] args){
        int week = 3;
        switch (week){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            default:
                System.out.println("周末");
        }
    }
}
