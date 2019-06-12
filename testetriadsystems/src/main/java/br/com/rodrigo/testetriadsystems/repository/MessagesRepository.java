package br.com.rodrigo.testetriadsystems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.testetriadsystems.domain.Messages;

@Repository
public interface MessagesRepository extends MongoRepository<Messages,String>{

}
