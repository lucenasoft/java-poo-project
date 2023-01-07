package application;

import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentória Java");
        mentoria.setDescricao("Descrição mentória Java");
        mentoria.setData(LocalDate.now());


        System.out.println(mentoria);

    }

}
