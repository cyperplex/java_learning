public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehavior;
    public Duck() {
    }

    public abstract void display();

    public void PerformFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        system.out.println("All ducks float, even decoys!");
    }

}