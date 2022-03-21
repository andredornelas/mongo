package br.com.dornelasit.mongotest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.dornelasit.mongotest.document.OrderDocument;

@Repository
public interface OrderRepository extends MongoRepository<OrderDocument, String> {

}
