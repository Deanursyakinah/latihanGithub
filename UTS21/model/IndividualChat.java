package UTS21.model;
import java.util.ArrayList;

public class IndividualChat extends Chat {
    private String friendUsername;
    private ArrayList<Message> pesan = new ArrayList<>();
    
    public IndividualChat(ChatStateEnum[] chatsStateEnums, String friendUsername, ArrayList<Message> pesan) {
        super(chatsStateEnums);
        this.friendUsername = friendUsername;
        this.pesan = pesan;
    }


    public String toString() {
        return " \nNama teman : " + friendUsername;
    }


    public String getFriendUsername() {
        return friendUsername;
    }


    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }


    public ArrayList<Message> getPesan() {
        return pesan;
    }


    public void setPesan(ArrayList<Message> pesan) {
        this.pesan = pesan;
    }
}
