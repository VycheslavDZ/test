package ru.ystu.rBook.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import ru.ystu.rBook.domain.Book;
import ru.ystu.rBook.service.BookService;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class BookConfig {
    private final BookService service;

    @PostConstruct
    public void init() {
        service.create(new Book(1L, "Вишнёвый сад", "1904", "Чехов", "драма"));
        service.create(new Book(2L, "Дама с собачкой", "1899", "Чехов", "драма"));
        service.create(new Book(3L, "Глупый француз ", "1886", "Чехов", "комедия"));
        service.create(new Book(4L, "Пиковая дама", "2014", "Пушкин", "драма"));
        service.create(new Book(5L, "Демон", "1839", "Лермонтов", "фантастика"));
    }
}
