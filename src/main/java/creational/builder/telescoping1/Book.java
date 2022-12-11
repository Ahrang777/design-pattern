package creational.builder.telescoping1;

/**
 * Telescoping Constructor Pattern
 */
public class Book {
    private Long id;		// 필수
    private String isbn;	// 필수
    private String title;	// 선택
    private String author;	// 선택
    private String pages;	// 선택
    private String category;// 선택

    public Book(Long id, String isbn) {
        this.id = id;
        this.isbn = isbn;
    }

    public Book(Long id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    public Book(Long id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Long id, String isbn, String title, String author, String pages) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(Long id, String isbn, String title, String author, String pages, String category) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
    }
}
