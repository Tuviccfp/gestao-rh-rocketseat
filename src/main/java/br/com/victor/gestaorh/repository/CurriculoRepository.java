package br.com.victor.gestaorh.repository;

import br.com.victor.gestaorh.domain.Curriculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculoRepository extends MongoRepository<Curriculo, String> {
}
