package com.jewel.book.bookstore.service.implementaion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.jewel.book.bookstore.model.Book;
import com.jewel.book.bookstore.service.GenericService;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements GenericService<Book> {

        private Long bookId = 100L;
        private Map<Long, Book> bookMap = new HashMap<>();
        {
                Book book = new Book();
                book.setBookid(bookId);
                book.setTitle("Spring Boot Microservice");
                book.setAuthor("Md Jewel");
                book.setCoverPhotoUrl("https://homepages.cae.wisc.edu/~ece533/images/fruits.png");
                book.setIsbnNumber(1232323L);
                book.setPrice(432.00);
                book.setLanguage("Bangla");
                bookMap.put(bookId, book);
        }

        @Override
        public Collection<Book> findAll() {
                return bookMap.values();
        }

        @Override
        public Book findById(Long id) {
                return bookMap.get(id);
        }

        @Override
        public Book save(Book book) {
                Long newBookId = ++bookId;
                book.setBookid(newBookId);
                bookMap.put(newBookId, book);
                return bookMap.get(newBookId);
        }

        @Override
        public Book update(Book book) {
                bookId = book.getBookid();
                if (bookMap.get(bookId) != null) {
                        bookMap.put(bookId, book);
                        return bookMap.get(bookId);
                }
                return null;
        }

        @Override
        public Book deleteById(Long id) {
                if (bookMap.get(id) != null) {
                        return bookMap.remove(id);
                }
                return null;
        }


        
}
