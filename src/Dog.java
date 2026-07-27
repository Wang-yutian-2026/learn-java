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

        System.out.println("狗名字："+spot.name+"，叫声："+spot.says);
        System.out.println("狗名字："+scruffy.name+"，叫声："+scruffy.says);
    }
}
