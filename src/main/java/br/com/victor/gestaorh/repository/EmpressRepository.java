package br.com.victor.gestaorh.repository;

import br.com.victor.gestaorh.domain.Empress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpressRepository extends MongoRepository<Empress, String> {
}
