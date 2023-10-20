package UTS1122029DeaNursyakinah;
import java.util.ArrayList;

public class User {
    private String userID;
    private String username;
    private String password;
    private String bio;
    ArrayList<Post> post = new ArrayList<Post>();
    
    public User(String userID, String username, String password, String bio, ArrayList<Post> post) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.post = post;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<Post> getPost() {
        return post;
    }

    public void setPost(ArrayList<Post> post) {
        this.post = post;
    }
}
