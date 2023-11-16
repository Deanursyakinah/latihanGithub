public class singleResponbility {

    private String name;
    private String author;
    private String text;
    // constructor, getters and setters
    
    public singleResponbility(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }



    // methods that directly relate to the book properties
    public String replaceWordInText(String word) {
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getAuthor() {
        return author;
    }



    public void setAuthor(String author) {
        this.author = author;
    }



    public String getText() {
        return text;
    }



    public void setText(String text) {
        this.text = text;
    }
}