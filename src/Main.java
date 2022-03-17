import br.com.dio.challenge.dominio.Bootcamp;
import br.com.dio.challenge.dominio.Curso;
import br.com.dio.challenge.dominio.Dev;
import br.com.dio.challenge.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java script");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria para o curso de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavid = new Dev();
        devDavid.setNome("Camila");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devDavid.getConteudosInscritos());
        devDavid.progredir();
        devDavid.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devDavid.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devDavid.getConteudosConcluidos());
        System.out.println("XP:" + devDavid.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}