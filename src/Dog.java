public class Dog {
    String name;
    String says;

    public static void main(String[] args){
        Dog spot = new Dog();
        spot.name="spot";
        spot.says="Ruff!";

        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf!";

        Dog spot2 = spot;

        System.out.println("==== == 地址比较 ====");
        System.out.println("spot == spots:"+(spot==spot2));
        System.out.println("spot == scruffy:"+(spot == scruffy));

        System.out.println("\n==== equals() 比较 ====");
        System.out.println("spot.equals(spot2):"+spot.equals(spot2));
        System.out.println("spot.equals(scruff):"+spot.equals(scruffy));

        System.out.println("\n狗名字："+spot.name+"，叫声："+spot.says);
        System.out.println("狗名字："+scruffy.name+"，叫声："+scruffy.says);
    }
}
