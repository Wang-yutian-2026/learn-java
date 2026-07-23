class FloatHolder{
    public float value;

    public FloatHolder(float initialValue){
        this.value = initialValue;
    }

    @Override
    public String toString(){
        return "FloatHolder{value="+value+"}";
    }

}


public class AliasingDemo {
    public static void main(String[] args){
        System.out.println("---别名机制---\n");

        FloatHolder holderA=new FloatHolder(10.5f);
        System.out.println("1. 创建对象: holderA = " + holderA);


        FloatHolder holderB = holderA;
        System.out.println("2. 创建别名: holderB = holderA");
        System.out.println("   此时, holderB = " + holderB);
        System.out.println("   (holderA 和 holderB 指向同一个对象)\n");

        System.out.println("3. 通过 holderA 修改值: holderA.value = 99.9f");
        holderA.value = 99.9f;

        System.out.println("   现在, holderA = " + holderA);
        System.out.println("   现在, holderB = " + holderB);
        System.out.println("\n结论: 通过 holderA 修改了对象，holderB 也看到了同样的变化。这证明了它们是同一个对象的别名。");
    }
}
