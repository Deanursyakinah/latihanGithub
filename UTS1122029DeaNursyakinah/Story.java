package UTS1122029DeaNursyakinah;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Story extends Post{
    private int duration;
    private int views;
    
    public Story(String postId, ContentState contentState, ContentType contentType, Timestamp timeUpload,
            ArrayList<Comment> comment, int duration, int views) {
        super(postId, contentState, contentType, timeUpload, comment);
        this.duration = duration;
        this.views = views;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

}
