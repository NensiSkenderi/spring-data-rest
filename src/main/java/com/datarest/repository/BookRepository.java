package com.datarest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datarest.entity.Book;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

  List<Book> findByName(@Param("name") String name);
  List<Book> findByAuthorName(@Param("authorName") String authorName);
}