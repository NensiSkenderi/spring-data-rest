package com.datarest.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datarest.entity.Library;

@RepositoryRestResource(collectionResourceRel = "library", path = "library")
public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {

  List<Library> findByName(@Param("name") String name);

}