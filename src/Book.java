public class Book {
    private String name;
    private int yearIssue;
    private String author;
    // конструктор
    public Book(String name, int yearIssue, String author) {
        this.name = name;
        this.yearIssue = yearIssue;
        this.author = author;
    }
    // геттер  название
    public String getName() {
        return this.name;
    }
    //геттер автор
    public String getAuthor() {
        return this.author;
    }
    public int getYearIssue() {
        return  this.yearIssue;
    }
    // setter год публикации
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }
}
