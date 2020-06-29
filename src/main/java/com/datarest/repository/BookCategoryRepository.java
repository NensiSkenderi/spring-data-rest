package com.datarest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datarest.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "bookCategory")
public interface BookCategoryRepository extends PagingAndSortingRepository<BookCategory, Long> {

  List<BookCategory> findByCategoryName(@Param("name") String name);
  List<BookCategory> findByCategoryDescription(@Param("description") String description);
}