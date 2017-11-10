package com.vigojug.springbootdemo.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vigojug.springbootdemo.model.Person;

@RepositoryRestResource
public interface PersonRestService extends PagingAndSortingRepository<Person, String>{

}
