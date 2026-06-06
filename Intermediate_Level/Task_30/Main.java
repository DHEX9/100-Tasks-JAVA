package Task_30;

public class Main {
    public void main(String[] args){
        Animals animal = new Animals();
        animal.makeSound();

        Dog cachorro = new Dog();
        cachorro.makeSound();

        Cat gato = new Cat();
        gato.makeSound();

        Animals animal2 = new Dog();
        animal2.makeSound();
    }
}
