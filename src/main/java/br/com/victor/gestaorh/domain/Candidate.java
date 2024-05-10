package br.com.victor.gestaorh.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Candidate {
    @Id
    private String id;
    private String name;
    private boolean applicationVaga;
    private String vagaPretendida;

    @DBRef
    private Curriculo curriculo;

    public Candidate(boolean applicationVaga, String id, String name, Curriculo curriculo) {
        this.applicationVaga = applicationVaga;
        this.id = id;
        this.name = name;
        this.curriculo = curriculo;
    }
}
