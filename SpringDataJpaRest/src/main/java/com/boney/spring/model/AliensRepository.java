package com.boney.spring.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aliens",path = "aliens")
public interface AliensRepository extends JpaRepository<Aliens, Integer>{

}