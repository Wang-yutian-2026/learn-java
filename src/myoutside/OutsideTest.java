package myoutside;

import myinside.InsideClass;

public class OutsideTest {
    public static void main(String[] args){
        InsideClass obj = new InsideClass();
        System.out.println(obj.name);
        obj.showMg();
    }
}
