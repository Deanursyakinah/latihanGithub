package Week7.model;
import java.time.LocalDateTime;

public class Message implements MessageStateInterface{
    private String content;
    private LocalDateTime time;
    private MessageStateInterface messageState;
    private MessageAvailabilityEnum messsageAvailability;
    
    public Message(String content, LocalDateTime time, MessageAvailabilityEnum messsageAvailability) {
        this.content = content;
        this.time = time;
        this.messsageAvailability = messsageAvailability;
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

    public MessageStateInterface getMessageState() {
        return messageState;
    }

    public void setMessageState(MessageStateInterface messageState) {
        this.messageState = messageState;
    }

    public MessageAvailabilityEnum getMesssageAvailability() {
        return messsageAvailability;
    }

    public void setMesssageAvailability(MessageAvailabilityEnum messsageAvailability) {
        this.messsageAvailability = messsageAvailability;
    }
}
