package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior =new flyWithWings();
  }
  public void display(){
    System.out.println("I'm a real Mallard duck.");
  }
}
    