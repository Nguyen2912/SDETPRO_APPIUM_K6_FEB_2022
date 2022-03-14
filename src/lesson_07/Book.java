package lesson_07;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private String year;

    public Book() {
    }

    public Book(String ISBN, String title, String authorName, String year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
