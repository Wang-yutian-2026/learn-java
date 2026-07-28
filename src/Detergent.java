public class Detergent extends Cleanser {
    @Override
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam(){append("foam()");}
}
