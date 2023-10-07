package PBO;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class overridingTes {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Dog barks karena dari kelas dog 
        Animal hewan = new Animal();
        Dog dog = new Dog();

        hewan.makeSound(); // Output: Animal makes a sound karena memanggil kelas Animal
        dog.makeSound();    // Output: Dog barks // karena memanggil kelas dog
    }
}
