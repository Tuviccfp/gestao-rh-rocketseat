package br.com.victor.gestaorh.services;

import br.com.victor.gestaorh.domain.Candidate;
import br.com.victor.gestaorh.repository.CandidateRepository;

import java.util.List;

public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAllCandidate() {
        return candidateRepository.findAll();
    }
    public Candidate findCandidateById(String id) {
        return candidateRepository.findById(id).orElse(null);
    }

    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public Candidate updateCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public void deleteCandidate(String id) {
        candidateRepository.deleteById(id);
    }
}
