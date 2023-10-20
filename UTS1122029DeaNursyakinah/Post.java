package UTS1122029DeaNursyakinah;
import java.sql.Timestamp;
import java.util.ArrayList;

public abstract class Post {
    private String postId;
    private ContentState contentState;
    private ContentType contentType;
    private Timestamp timeUpload;
    ArrayList<Comment> comment = new ArrayList<Comment>();
    
    public Post(String postId, ContentState contentState, ContentType contentType, Timestamp timeUpload,
            ArrayList<Comment> comment) {
        this.postId = postId;
        this.contentState = contentState;
        this.contentType = contentType;
        this.timeUpload = timeUpload;
        this.comment = comment;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public ContentState getContentState() {
        return contentState;
    }

    public void setContentState(ContentState contentState) {
        this.contentState = contentState;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Timestamp getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }
}
