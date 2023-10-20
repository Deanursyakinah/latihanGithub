package Week7.model;

public class IndividualChat extends Chat {
    private String friendUsername;
    
    public IndividualChat(ChatStateEnum[] chatsStateEnums, String friendUsername) {
        super(chatsStateEnums);
        this.friendUsername = friendUsername;
    }

    public String getFriendUsername() {
        return friendUsername;
    }

    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }

}
