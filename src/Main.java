import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTituto("Curso de js");
        curso1.setDescricao("curso de js iniciante");
        curso1.setCargaHoraria(4);

        curso2.setTituto("Curso de Python");
        curso2.setDescricao("Curso de python iniciante");
        curso2.setCargaHoraria(4);

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso de desenvolvimento de programação em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        mentoria.setTituto("Mentoria de java");
        mentoria.setDescricao("Mentoria java com diversos abordagens em POO");
        mentoria.setData(LocalDate.now());

        Dev devJon = new Dev();
        devJon.setNome("Jhon");

        devJon.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos: "+devJon.getConteudosInscritos());
        devJon.progredir();
        devJon.progredir();
        devJon.progredir();

        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos: "+devJon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+devJon.getConteudosConcluidos());
        System.out.println("XP: "+devJon.calcularTotalXp());

    }
}
