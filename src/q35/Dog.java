package q35;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating biscuits");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }
}
