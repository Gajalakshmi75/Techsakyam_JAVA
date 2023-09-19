abstract class animal{
    abstract void makesound();
    public void eat(){
        System.out.println("I can eat");
    }
}
class dog extends animal{
    public void makesound(){
        System.out.println("Bark Bark");
    }
}
public class Abstract_main {
    public static void main(String[] args)
    {
        dog obj=new dog();
        obj.makesound();
        obj.eat();
    }
    
}
