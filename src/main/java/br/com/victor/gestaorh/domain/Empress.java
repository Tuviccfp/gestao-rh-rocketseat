package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document
public class Empress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nome;
    private String descriptionEmpress;

    @DBRef
    List<Vaga> vagas = new ArrayList<>();

    public Empress(String id, String nome, String descriptionEmpress) {
        this.id = id;
        this.nome = nome;
        this.descriptionEmpress = descriptionEmpress;
    }
    public void addVagas(Vaga vaga) {
        this.vagas.add(vaga);
    }

    public String returnToStringCreate() {
        return "Empresa criada com sucesso. O identificador da sua empresa é: " + getId();
    }
}
