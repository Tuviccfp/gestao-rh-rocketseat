package br.com.victor.gestaorh.controller;

import br.com.victor.gestaorh.domain.Empress;
import br.com.victor.gestaorh.domain.Vaga;
import br.com.victor.gestaorh.repository.EmpressRepository;
import br.com.victor.gestaorh.repository.VagaRepository;
import br.com.victor.gestaorh.services.CandidateService;
import br.com.victor.gestaorh.services.CurriculoService;
import br.com.victor.gestaorh.services.EmpressService;
import br.com.victor.gestaorh.services.VagaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {

    private final VagaService vagaService;
    private final EmpressService empressService;
    private final CandidateService candidateService;
    private final CurriculoService curriculoService;

    public VagaController(VagaService vagaService,
                          EmpressService empressService,
                          CandidateService candidateService,
                          CurriculoService curriculoService) {
        this.vagaService = vagaService;
        this.empressService = empressService;
        this.candidateService = candidateService;
        this.curriculoService = curriculoService;
    }

    @GetMapping(value = "/search-vaga")
    public ResponseEntity<Vaga> searchVaga(@RequestBody String id) {
        Vaga findVaga = vagaService.findVagaById(id);
        return new ResponseEntity<>(findVaga, HttpStatus.OK);
    }

    @PostMapping(value = "/register-new-vaga")
    public ResponseEntity<String> insertNewVaga(@RequestBody Vaga vaga, String id) {
        Empress empress = empressService.findById(id);
        Vaga newVaga = new Vaga(vaga.getDescriptionVaga(), vaga.getId(), vaga.getQuantityVagas(), vaga.getTitle(), empress);
        return new ResponseEntity<>(newVaga.returnToCreate(), HttpStatus.CREATED);
    }

}
