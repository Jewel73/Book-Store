package com.jewel.book.bookstore.controller;

import java.util.Collection;

import com.jewel.book.bookstore.model.Book;
import com.jewel.book.bookstore.service.GenericService;
import com.jewel.book.bookstore.utility.GenericMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookGenericImpController implements GenericMethod<Book> {

        @Autowired
        private GenericService<Book> bookService;

        @Override
        public ResponseEntity<Collection<Book>> findAll() {
                return new ResponseEntity<>( bookService.findAll(), HttpStatus.OK);
        }

        @Override
        public ResponseEntity<Book> findById(Long id) {
                return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);

        }

        @Override
        public ResponseEntity<Book> save(Book book) {
                return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);

        }

        @Override
        public ResponseEntity<Book> update(Book book) {
                return new ResponseEntity<>(bookService.update(book), HttpStatus.OK);

        }

        @Override
        public ResponseEntity<Book> deleteById(Long id) {
                return new ResponseEntity<>(bookService.deleteById(id), HttpStatus.OK);
        }

}
