import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curos1 = new Curso();
        curos1.setTitulo("curso java");
        curos1.setDescricao("java");
        curos1.setCargaHoraria(4);

        Curso curos2 = new Curso();
        curos2.setTitulo("curso python");
        curos2.setDescricao("python");
        curos2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("java");
        bootcamp.getConteudos().add(curos1);
        bootcamp.getConteudos().add(curos2);
        bootcamp.getConteudos().add(mentoria);

        Dev levi = new Dev();
        levi.setNome("Levi");
        levi.inscreverBootcamp(bootcamp);
        System.out.println("contudos inscritos " + levi.getConteudosInscritos());
        levi.progredir();
        System.out.println("contudos concluidos " + levi.getConteudosConcuidos());
        System.out.println("Xp " + levi.calcularTotalXp());

        Dev davi = new Dev();
        davi.setNome("davi");
        davi.inscreverBootcamp(bootcamp);
        System.out.println("contudos inscritos " + davi.getConteudosInscritos());
        davi.progredir();
        System.out.println("contudos concluidos " + davi.getConteudosConcuidos());
        System.out.println("Xp " + davi.calcularTotalXp());

    }
}
