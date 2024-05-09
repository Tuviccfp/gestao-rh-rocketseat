package br.com.victor.gestaorh.repository;

import br.com.victor.gestaorh.domain.Vaga;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends MongoRepository<Vaga, String> {

}
