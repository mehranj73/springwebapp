package com.mehranj73.springwebapp.repositories;

import com.mehranj73.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {


}
