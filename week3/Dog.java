package PBO.week3;

public class Dog extends Animal implements InterfaceStatus {
    public Dog(String name, int age, String food, String gender, int alive) {
        super.name = name;
        super.age = age;
        super.food = food;
        super.gender = gender;
        super.alive = alive;
    }

    public String printSound() {
        return "suara anjing : gugugugug";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printData() {
        return "jenis parent : " + Animal.class.getSimpleName() 
        + "\njenis child : " + getClass().getSimpleName()
        + "\nnama hewan : " + super.name
        + "\numur hewan : " + super.age
        + "\ngender hewan : " + super.gender
        + "\nstatus alive : " + isAlive()
        + "\n" + printSound();
    }
}

