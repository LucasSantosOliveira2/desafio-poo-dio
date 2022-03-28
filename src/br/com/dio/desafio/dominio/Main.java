package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("");
        System.out.println("Conteúdos Inscritos" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXp());

        System.out.println("-----------");

        Dev devSantos = new Dev();
        devSantos.setNome("Santos");
        devSantos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devSantos.getConteudosInscritos());
        devSantos.progredir();
        devSantos.progredir();
        devSantos.progredir();
        System.out.println("");
        System.out.println("Conteúdos Inscritos" + devSantos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devSantos.getConteudosConcluidos());
        System.out.println("XP:" + devSantos.calcularTotalXp());



    }
}
