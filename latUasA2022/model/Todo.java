package model;

public class Todo {
    private int id;
    private String title;
    private String note;
    private int userId; // Menggunakan ID pengguna sebagai referensi

    public Todo() {
        
    }
    
    public Todo(int id, String title, String note, int userId) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
