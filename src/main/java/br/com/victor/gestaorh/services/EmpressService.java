package br.com.victor.gestaorh.services;

import br.com.victor.gestaorh.domain.Empress;
import br.com.victor.gestaorh.repository.EmpressRepository;

import java.util.List;

public class EmpressService {
    private final EmpressRepository empressRepository;

    public EmpressService(EmpressRepository empressRepository) {
        this.empressRepository = empressRepository;
    }

    public List<Empress> findAll() {
        return empressRepository.findAll();
    }
    public Empress findById(String id) {
        return empressRepository.findById(id).orElse(null);
    }

    public Empress addEmpress(Empress empress) {
        return empressRepository.save(empress);
    }
    public Empress updateEmpress(Empress empress) {
        return empressRepository.save(empress);
    }
    public void deleteEmpress(String id) {
        empressRepository.deleteById(id);
    }

}
