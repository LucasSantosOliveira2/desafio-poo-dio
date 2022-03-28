package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
