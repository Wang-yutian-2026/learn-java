package packageb;
import packagea.Parent;

public class Son extends Parent{
    public void testCall(){
        showProtected();
    }

    public static void main(String[] args){
        Son son = new Son();
        son.testCall();
    }
}