public class StringArrayTest {
    public static void main(String[] args){
        String[] strArr = {"Java","C++","Python","Go","PHP"};

        for (int i=0;i< strArr.length;i++){
            System.out.println("第"+(i+1)+"个元素："+strArr[i]);
        }

        System.out.println("===分割线===");

        String[] arr2 = new String[3];
        arr2[0]="苹果";
        arr2[1]="香蕉";
        arr2[2]="橙子";

        for (int i=0;i< arr2.length;i++){
            System.out.println((arr2[i]));
        }
    }
}
