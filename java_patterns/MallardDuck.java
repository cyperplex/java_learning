public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Im a real Mallard Duck");
    }
}