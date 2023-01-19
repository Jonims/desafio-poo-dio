import inter.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descrição");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("**8****8***8");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoni = new Dev();
        devJoni.setNome("Joni");
        devJoni.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joni: " + devJoni.getConteudoInscritos());

        devJoni.progredir();
        devJoni.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Joni: " + devJoni.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Joni: " + devJoni.getConteudoConcluidos());
        System.out.println("XP: " + devJoni.calcularTotalXp());

        System.out.println("-------------");

        Dev devRaul = new Dev();
        devRaul.setNome("Raul");
        devRaul.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Raul: " + devRaul.getConteudoInscritos());

        devRaul.progredir();
        devRaul.progredir();
        devRaul.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Raul: " + devRaul.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Raul: " + devRaul.getConteudoConcluidos());
        System.out.println("XP: " + devRaul.calcularTotalXp());
    }
}