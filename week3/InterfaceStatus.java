package PBO.week3;

public interface InterfaceStatus {
    //konstanta 
    int dead = 0;
    int alive = 1;

    abstract boolean isAlive();
    abstract String printData();
}
