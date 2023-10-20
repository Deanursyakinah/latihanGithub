package UTS1122029DeaNursyakinah;
public class Comment {
    private String commentId;
    private String text;
    private ContentState contentState;
    
    public Comment(String commentId, String text, ContentState contentState) {
        this.commentId = commentId;
        this.text = text;
        this.contentState = contentState;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContentState getContentState() {
        return contentState;
    }

    public void setContentState(ContentState contentState) {
        this.contentState = contentState;
    }
}
