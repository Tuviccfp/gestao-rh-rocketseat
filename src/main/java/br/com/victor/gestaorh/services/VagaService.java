package br.com.victor.gestaorh.services;

import br.com.victor.gestaorh.domain.Vaga;
import br.com.victor.gestaorh.repository.VagaRepository;

import java.util.List;

public class VagaService {
    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> findAllVaga() {
        return vagaRepository.findAll();
    }

    public Vaga findVagaById(String id) {
        return vagaRepository.findById(id).orElse(null);
    }

    public Vaga addVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    public Vaga updateVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }
}
