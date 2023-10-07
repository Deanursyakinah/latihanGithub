package PBO.week3;

public abstract class Animal implements InterfaceStatus{
    String name;
    int age;
    String food;
    String gender;
    int alive;

    @Override
    public String printData() {
        //getsimplename cara untuk mendapatkan nama kelas walaupun nama kelasnya sudah di rename kalau pakai getsimplename dia otomatis ngeget nama kelas
        return "jenis parent : " + Animal.class.getSimpleName() 
        + "\njenis child : " + getClass().getSimpleName();
        // + "\nnama hewan : " + super.name
        // + "\numur hewan : " + super.age
        // + "\ngender hewan : " + super.gender
        // + "\nstatus alive : " + sisAlive()
        // + "\n" + printSound();
    }
}
