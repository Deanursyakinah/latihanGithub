package UTS21.model;

import java.util.ArrayList;

public class GroupChat extends Chat {
    private String groupName;
    private String[] groupMember;
    private ArrayList<Message> pesan = new ArrayList<>();

    public GroupChat(ChatStateEnum[] chatsStateEnums, String groupName, String[] groupMember, ArrayList<Message> pesan) {
        super(chatsStateEnums);
        this.groupName = groupName;
        this.groupMember = groupMember;
        this.pesan = pesan;
    }

    public String toString() {
        return " \nNama group : " + groupName + " \nGroup member : " + groupMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String[] getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(String[] groupMember) {
        this.groupMember = groupMember;
    }

    public ArrayList<Message> getPesan() {
        return pesan;
    }

    public void setPesan(ArrayList<Message> pesan) {
        this.pesan = pesan;
    }
}
