package application;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentória Java");
        mentoria.setDescricao("Descrição mentória Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel Lucena");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos" + devGabriel.getConteudosInscritos());
        System.out.println("------------============--------------");
        devGabriel.progredir();
        System.out.println("Contéudos Inscritos " + devGabriel.getConteudosInscritos());
        System.out.println("Contéudos Concluídos " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

    }

}
