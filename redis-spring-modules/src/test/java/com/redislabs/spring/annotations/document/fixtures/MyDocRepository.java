package com.redislabs.spring.annotations.document.fixtures;

import java.util.Optional;

import com.redislabs.spring.repository.RedisDocumentRepository;

public interface MyDocRepository extends RedisDocumentRepository<MyDoc, String>, MyDocQueries {
  Optional<MyDoc> findByTitle(String title);
}
