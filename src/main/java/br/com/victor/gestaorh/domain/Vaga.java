package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Vaga {
    @Id
    private String id;
    private String title;
    private String descriptionVaga;
    private int quantityVagas;

    @DBRef
    Empress empress;

    public Vaga(String descriptionVaga, String id, int quantityVagas, String title, Empress empress) {
        this.descriptionVaga = descriptionVaga;
        this.id = id;
        this.quantityVagas = quantityVagas;
        this.title = title;
        this.empress = empress;
    }
}
