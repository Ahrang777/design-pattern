package builder.lombokbuilder4;

import lombok.Builder;
import lombok.NonNull;

/**
 * lombok을 이용한 Builder 패턴
 */
@Builder
public class Book {
    @NonNull // 필수 속성임을 의미
    private Long id;		// 필수

    @NonNull
    private String isbn;	// 필수
    private String title;	// 선택
    private String author;	// 선택
    private int pages;	// 선택
    private String category;// 선택
}