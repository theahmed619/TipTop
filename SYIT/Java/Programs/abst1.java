abstract class  Cow{
    abstract void milk();
   
}
class MilkDairy extends Cow{
    public void milk()
    {
        System.out.println("Milk got it ");
    }
    public void curd()
    {
        System.out.println("curd...");
    }
}
public class abst1 {
    public static void main(String[] args) {
        MilkDairy jenny =new MilkDairy();
        jenny.milk();
    }
}
