package com.jewel.book.bookstore.utility;

import java.util.Collection;

import com.jewel.book.bookstore.model.Book;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface GenericMethod<T> {
        @GetMapping()
        ResponseEntity< Collection <T>>findAll();
        
        @GetMapping("{id}")
        ResponseEntity<T> findById(@PathVariable Long id);
        
        @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
        ResponseEntity<T> save(T t);

        @PutMapping(consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
        public ResponseEntity<T> update(T t);

        @DeleteMapping("{id}")
        public ResponseEntity<T> deleteById(@PathVariable Long id);
}

