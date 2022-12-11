package creational.builder;

import creational.builder.builder3.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder(1L, "isbn1234")
                .author("지은이")
                .pages(360)
                .category("CE")
                .title("Design Pattern").build();

        System.out.println(book);
    }
}
