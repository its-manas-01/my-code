abstract class animal
{
    abstract void walk();
}
class horse extends animal
{
    void walk()
    {
        System.out.println("horse is walking on 4 lages");
    }
}
class chicken extends animal
{
    void walk()
    {
        System.out.println("chicken is walking on 2 lages");
    }
}
public class oops 
{
    public static void main(String[] args)
    {
        horse horse = new horse();
        horse.walk();
        // animal animal = new animal();
        // animal.walk();
    }    
}
