package PBO.week3;
import java.util.ArrayList;

public class Main {
    public void print(ArrayList<Animal> listAnimal) {
        for (int i = 0; i < listAnimal.size(); i++) {
            Animal hewan = listAnimal.get(i);

            System.out.println("=======================================");
            if (hewan instanceof Cat) {
                Cat kucing = (Cat) hewan;
                System.out.print(kucing.printData());
            } else if (hewan instanceof Dog) {
                Dog anjing = (Dog) hewan;
                System.out.print(anjing.printData());
            } else if (hewan instanceof Duck) {
                Duck bebek = (Duck) hewan;
                System.out.print(bebek.printData());
            } else if (hewan instanceof Horse) {
                Horse kuda = (Horse) hewan;
                System.out.print(kuda.printData());
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args){
        Main mainClass = new Main();
        ArrayList<Animal> listAnimal = new ArrayList();
        // Animal animal = new Animal();

        //dummy data hewan
        Cat cat = new Cat("memo", 2, "whiskas", "female", 1);
        Cat cat2 = new Cat("mochi", 5, "whiskas", "male", 1);
        listAnimal.add(cat);
        listAnimal.add(cat2);

        Dog dog = new Dog("digii", 3, "pedigree", "female", 1);
        Dog dog2 = new Dog("rizii", 2, "pedigree", "male", 0);
        listAnimal.add(dog);
        listAnimal.add(dog2);

        Duck duck = new Duck("duckyy", 2, "dedak", "female", 0);
        Duck duck2 = new Duck("bibii", 2, "dedak", "female", 1);
        listAnimal.add(duck);
        listAnimal.add(duck2);

        Horse kuda = new Horse("koboy", 20, "rumput", "female", 1);
        Horse kuda2 = new Horse("chibi", 10, "rumput", "female", 1);
        listAnimal.add(kuda);
        listAnimal.add(kuda2);

        mainClass.print(listAnimal);
    }
}
