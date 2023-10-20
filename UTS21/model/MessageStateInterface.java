package UTS21.model;

public interface MessageStateInterface {
    int READ = 1;
    int UNREAD = 0;

    boolean state();
}
