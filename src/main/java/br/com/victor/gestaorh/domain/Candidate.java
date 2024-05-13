package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document
public class Candidate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @DBRef
    private Curriculo curriculo;
    @DBRef
    private Vaga vaga;

    public Candidate(String id, Curriculo curriculo, Vaga vaga) {
        this.id = id;
        this.curriculo = curriculo;
        this.vaga = vaga;
    }
}
