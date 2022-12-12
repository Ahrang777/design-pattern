package creational.builder.builder3;

/**
 * Builder 패턴
 */
public class Book {
    private Long id;		// 필수
    private String isbn;	// 필수
    private String title;	// 선택
    private String author;	// 선택
    private int pages;	// 선택
    private String category;// 선택

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", category='" + category + '\'' +
                '}';
    }

    public static class BookBuilder {
        private Long id;		// 필수
        private String isbn;	// 필수
        private String title;	// 선택
        private String author;	// 선택
        private int pages;	// 선택
        private String category;// 선택

        // 필수 인자는 빌더 생성자로 받기
        public BookBuilder(Long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        // 선택적 인자
        // 메서드 체이닝을 위한 BookBuilder 반환
        // 메서드 이름을 생성하고자 하는 클래스의 인스턴스 변수로 하여 파악하기 쉽도록 한다.
        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public BookBuilder category(String category) {
            this.category = category;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.id = this.id;
            book.isbn = this.isbn;
            book.author = this.author;
            book.title = this.title;
            book.pages = this.pages;
            book.category = this.category;
            return book;
        }
    }
}