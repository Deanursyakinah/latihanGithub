package UTS21.model;
import java.time.LocalDateTime;

public class Message extends Chat implements MessageStateInterface{
    private String content;
    private LocalDateTime time;
    private int messageState; //mengubah tipe data agar interface bisa diimplementasikan
    private MessageAvailabilityEnum messsageAvailability;

    public Message(ChatStateEnum[] chatsStateEnums, String content, LocalDateTime time, int messageState, MessageAvailabilityEnum messsageAvailability) {
        super(chatsStateEnums);
        this.content = content;
        this.time = time;
        this.messageState = messageState;
        this.messsageAvailability = messsageAvailability;
    }

    @Override
    public boolean state() {
        if (messageState == 1) {
            return true;
        } else {
            return false;
        }
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getMessageState() {
        return messageState;
    }

    public void setMessageState(int messageState) {
        this.messageState = messageState;
    }

    public MessageAvailabilityEnum getMesssageAvailability() {
        return messsageAvailability;
    }

    public void setMesssageAvailability(MessageAvailabilityEnum messsageAvailability) {
        this.messsageAvailability = messsageAvailability;
    } 
}
