package com.mehranj73.springwebapp.repositories;

import com.mehranj73.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
