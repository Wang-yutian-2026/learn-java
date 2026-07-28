public class SterilizingDetergent extends Detergent {
    @Override
    public void scrub() {
        append("SterilizingDetergent.scrub()");
        super.scrub();
    }


    //新增方法sterilize()
    public void sterilize() {
        append("sterilize()");
    }

    public static void main(String[] args) {
        SterilizingDetergent obj = new SterilizingDetergent();

        obj.dilute();
        obj.apply();
        obj.scrub();
        obj.foam();
        obj.sterilize();

        System.out.println(obj);
    }
}