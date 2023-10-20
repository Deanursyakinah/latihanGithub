package Week7.model;
import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    private String profileName;
    private LocalDate birthdate;
    private String email;
    private String phoneNumber;
    private ArrayList<Chat> chat;

    public User(String username, String password, String profileName, LocalDate birthdate, String email, String phoneNumber, ArrayList<Chat> chat) {
        this.username = username;
        this.password = password;
        this.profileName = profileName;
        this.birthdate = birthdate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.chat = chat;
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

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Chat> getChat() {
        return chat;
    }

    public void setChat(ArrayList<Chat> chat) {
        this.chat = chat;
    }
}
