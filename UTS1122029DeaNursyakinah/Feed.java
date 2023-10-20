package UTS1122029DeaNursyakinah;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Feed extends Post{
    private String caption;
    private int likes;
    
    public Feed(String postId, ContentState contentState, ContentType contentType, Timestamp timeUpload,
            ArrayList<Comment> comment, String caption, int likes) {
        super(postId, contentState, contentType, timeUpload, comment);
        this.caption = caption;
        this.likes = likes;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
