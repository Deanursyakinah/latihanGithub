package Week7.model;

public class GroupChat extends Chat {
    private String groupName;
    private String[] groupMember;
    
    public GroupChat(String groupName, String[] groupMember) {
        super(chatsStateEnums);
        this.groupName = groupName;
        this.groupMember = groupMember;
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
    
}
