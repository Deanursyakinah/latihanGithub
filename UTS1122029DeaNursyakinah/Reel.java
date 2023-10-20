package UTS1122029DeaNursyakinah;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Reel extends Post{
    private int duration;
    private int playedCount;
    
    public Reel(String postId, ContentState contentState, ContentType contentType, Timestamp timeUpload,
            ArrayList<Comment> comment, int duration, int playedCount) {
        super(postId, contentState, contentType, timeUpload, comment);
        this.duration = duration;
        this.playedCount = playedCount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPlayedCount() {
        return playedCount;
    }

    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
    
    
}
