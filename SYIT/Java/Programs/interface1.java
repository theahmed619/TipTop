interface Animal{
    void eating();
    void voice();

}
class Dog implements Animal{
    public void eating()
    {
        System.out.println("Bone..");
    }
    public void voice()
    {
        System.out.println(" Bow Bow");
    }
}
class Cow implements Animal{
    public void eating()
    {
        System.out.println("Grass..");
    }
    public void voice()
    {
        System.out.println(" Mow mow");
    }
}
public class interface1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
    dog.eating();
    dog.voice();
    }
    

}
