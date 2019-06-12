package br.com.rodrigo.testetriadsystems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.testetriadsystems.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
