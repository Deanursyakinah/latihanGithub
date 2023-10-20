package Week7.model;

public abstract class Chat {
    private ChatStateEnum[] chatsStateEnums;

    public Chat(ChatStateEnum[] chatsStateEnums) {
        this.chatsStateEnums = chatsStateEnums;
    }

    public ChatStateEnum[] getChatsStateEnums() {
        return chatsStateEnums;
    }

    public void setChatsStateEnums(ChatStateEnum[] chatsStateEnums) {
        this.chatsStateEnums = chatsStateEnums;
    }
}
