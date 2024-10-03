package com.Library.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Library.RestAPI.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
