package br.com.cleanarch.bruno.cleanarch.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerRepository, String> {

}
