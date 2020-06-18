public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehaviour quackBehaviour;
    
    public Duck() {
    }

    public abstract void display();

    public void PerformFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}