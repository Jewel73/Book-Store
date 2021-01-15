package com.jewel.book.bookstore.service;

import java.util.Collection;

public interface GenericService <T>{
        Collection <T> findAll();
        T findById(Long id);
        T save(T t);
        T update(T t);
        T deleteById(Long id);
}
