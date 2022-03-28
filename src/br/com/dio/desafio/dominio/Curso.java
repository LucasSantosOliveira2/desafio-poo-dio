package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
