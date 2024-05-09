package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Document
public class Curriculo {
    @Id
    private String id;
    private String nome;
    private String email;
    private Map<Integer, String> competencias = new HashMap<>();
    private Map<String, String> endereco = new HashMap<>();

    public Curriculo(String email, String id, String nome) {
        this.email = email;
        this.id = id;
        this.nome = nome;
    }

    public void setCompetencias(int quantityCompetencias, String value) {
        for (int i = 0; i < quantityCompetencias; i++) {
            this.competencias.put(i++, value);
        }
    }

    public void setEndereco(String value) {
        this.endereco.put("Rua:", value);
        this.endereco.put("N° da casa/prédio: ", value);
        this.endereco.put("Bairro:", value);
        this.endereco.put("Bairro: ", value);

    }

}
