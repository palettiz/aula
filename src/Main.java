public class Main {

    public static void main(String[] args) {
        int variavel = 1;

        String teste = "dght";

        Aluno aluno1 = new Aluno("Oliver", "Comunicação Visual");

        System.out.println("O aluno "+ aluno1.nome+ " esta fazendo o curso de " + aluno1.curso);
        System.out.println("Tem "+aluno1.faltas+ " faltas");

        aluno1.darFaltas(2);
        System.out.println("Tem "+aluno1.faltas+" faltas");

        aluno1.darFaltas(49);
        System.out.println("Tem "+aluno1.faltas+" faltas");

        aluno1.darNota(80);
        System.out.println("Sua nota é"+aluno1.nota);

        aluno1.darNota(50);
        System.out.println("Sua nota é"+aluno1.nota);

        List<Aluno> listaDealunos = new ArrayList<>();

        listaDealunos.add(aluno1);
        listaDealunos.add(aluno2);
        listaDealunos.add(new Aluno("Oli", "TI"));

        for

        Aluno aluno2 = new Aluno("Oli", "TI ");

        System.out.println("O aluno "+ aluno2.nome+ " esta fazendo o curso de " + aluno2.curso);
        System.out.println("Tem "+aluno2.faltas+ " faltas");

        aluno2.darFaltas(2);
        System.out.println("Tem "+aluno2.faltas+" faltas");

        aluno2.darFaltas(76);
        System.out.println("Tem "+aluno2.faltas+" faltas");

        aluno2.darNota(90);
        System.out.println("Sua nota é"+aluno2.nota);

        aluno2.darNota(30);
        System.out.println("Sua nota é"+aluno2.nota);

    }
}
