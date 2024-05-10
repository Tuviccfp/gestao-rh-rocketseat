package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Document
public class Curriculo implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public void addCompetencias(Integer chave, String value) {
        this.competencias.put(chave, value);
    }

    public void addEndereco(String chave, String value) {
        this.endereco.put(chave, value);
    }
}
