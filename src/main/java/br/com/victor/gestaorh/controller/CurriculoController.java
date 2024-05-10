package br.com.victor.gestaorh.controller;

import br.com.victor.gestaorh.domain.Curriculo;
import br.com.victor.gestaorh.services.CurriculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/curriculo")
public class CurriculoController {

    private final CurriculoService curriculoService;
    public CurriculoController(CurriculoService curriculoService) {
        this.curriculoService = curriculoService;
    }

    @PostMapping(value = "/create-curriculo")
    public ResponseEntity<String> createCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo newCurriculo = new Curriculo(curriculo.getEmail(), curriculo.getId(), curriculo.getNome());
        for(Map.Entry<Integer, String> entry : curriculo.getCompetencias().entrySet()) {
            //Para cada competencia contida em currículo com chave valor, adiciono no meu novo HashMap entry com os mesmos tipos.
            newCurriculo.addCompetencias(entry.getKey(), entry.getValue());
        }
        for(Map.Entry<String, String> entryEnderess : curriculo.getEndereco().entrySet()) {
            newCurriculo.addEndereco(entryEnderess.getKey(), entryEnderess.getValue());
        }
        curriculoService.save(newCurriculo);
        return ResponseEntity.status(HttpStatus.CREATED).body("Currículo cadastrado com sucesso! Seu número de currículo é: " + newCurriculo.getId());
    }

}
