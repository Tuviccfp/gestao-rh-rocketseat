package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class Empress {
    @Id
    private String id;
    private String nome;
    private String descriptionEmpress;

    @Setter
    @DBRef
    List<Candidate> candidates = new ArrayList<>();

    public Empress(String id, String nome, String descriptionEmpress) {
        this.id = id;
        this.nome = nome;
        this.descriptionEmpress = descriptionEmpress;
    }

}
