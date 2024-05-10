package br.com.victor.gestaorh.services;

import br.com.victor.gestaorh.domain.Curriculo;
import br.com.victor.gestaorh.repository.CurriculoRepository;

import java.util.List;

public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    public List<Curriculo> findAll() {
        return curriculoRepository.findAll();
    }
    public Curriculo findById(String id) {
        return curriculoRepository.findById(id).orElse(null);
    }
    public Curriculo save(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }
    public void delete(Curriculo curriculo) {
        curriculoRepository.delete(curriculo);
    }
    public Curriculo update(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }
}
