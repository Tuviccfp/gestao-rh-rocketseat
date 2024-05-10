package br.com.victor.gestaorh.repository;

import br.com.victor.gestaorh.domain.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
