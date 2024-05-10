package br.com.victor.gestaorh.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Empress {
    @Id
    private String id;
    private String nome;
    private String descriptionEmpress;

    @DBRef
    List<Vaga> vaga;
}
