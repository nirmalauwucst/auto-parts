/**
 * 
 */
package it.nmadlk.repository;

import org.springframework.data.repository.CrudRepository;

import it.nmadlk.models.Part;

/**
 * @author Navo
 * This is an out-of the box solution of Spring Project for building standard CRUD operations/methods
 * Spring Data JPA is providing the class and what you need is implementing the interface which uses the implementation comes with Spring Data JPA
 * Spring Data JPA comes with one common repository called "CrudRepository<>". This is an interface and you just have to extend this. 
 * Your custom repository is extended by "CrudRepository<>" which contains all the common methods/CRUD operations.
 * CrudRepository is a generic type.So you need to provide that generic type information. Here you need to provide two types of generic information
 * First one is what is the entity class is here working with(Here "Part"). The second generic type is what is the Id that entity class has(Here it is a "String").
 */
public interface PartRepository extends CrudRepository<Part, String> {

}
