package PBO.week3;

public class Cat extends Animal implements InterfaceStatus {
    public Cat(String name, int age, String food, String gender, int alive) {
        super.name = name;
        super.age = age;
        super.food = food;
        super.gender = gender;
        super.alive = alive;
    }

    public String printSound() {
        return "suara kucing : meooonggg";
    }

    @Override
    public boolean isAlive() {
        if (super.alive == 1) {
            return true;
        } else {
            return false;
        }
    }

    // @Override
    // public String printData() {
    //     //getsimplename cara untuk mendapatkan nama kelas walaupun nama kelasnya sudah di rename kalau pakai getsimplename dia otomatis ngeget nama kelas
    //     return "jenis parent : " + Animal.class.getSimpleName() 
    //     + "\njenis child : " + getClass().getSimpleName()
    //     + "\nnama hewan : " + super.name
    //     + "\numur hewan : " + super.age
    //     + "\ngender hewan : " + super.gender
    //     + "\nstatus alive : " + isAlive()
    //     + "\n" + printSound();
    // }
}
