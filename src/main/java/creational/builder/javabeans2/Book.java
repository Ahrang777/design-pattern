package builder.javabeans2;

/**
 * JavaBeans 패턴
 */
public class Book {
    private Long id;		// 필수
    private String isbn;	// 필수
    private String title;	// 선택
    private String author;	// 선택
    private String pages;	// 선택
    private String category;// 선택

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}