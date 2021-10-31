package LAB92;

public class Book {
    private String title;
    private String ISBN;
    private String authorName;
    private int year;

    public Book(String title, String ISBN, String authorName, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.authorName = authorName;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                '}';
    }
}
