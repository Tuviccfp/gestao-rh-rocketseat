package br.com.victor.gestaorh.controller;

import br.com.victor.gestaorh.domain.Empress;
import br.com.victor.gestaorh.services.EmpressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/empresas")
public class EmpressController {

    private final EmpressService empressService;

    public EmpressController(EmpressService empressService) {
        this.empressService = empressService;
    }

    @GetMapping(value = "/search-empress")
    public ResponseEntity<Empress> searchEmpress(@RequestBody String id) {
        Empress newEmpress = empressService.findById(id);
        return new ResponseEntity<>(newEmpress, HttpStatus.OK);
    }

    @PostMapping(value = "/create-empresa")
    public ResponseEntity<String> createEmpress(@RequestBody Empress empress) {
        Empress newEmpress = new Empress(empress.getId(), empress.getNome(), empress.getDescriptionEmpress());
        empressService.addEmpress(newEmpress);
        return new ResponseEntity<>(empress.returnToStringCreate(), HttpStatus.CREATED);
    }
}
