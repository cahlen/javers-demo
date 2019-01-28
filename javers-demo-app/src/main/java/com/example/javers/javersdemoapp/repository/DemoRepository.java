package com.example.javers.javersdemoapp.repository;

import com.example.javers.javersdemoapp.dao.Person;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.PagingAndSortingRepository;

@JaversSpringDataAuditable
public interface DemoRepository extends PagingAndSortingRepository<Person, Long> {
}
