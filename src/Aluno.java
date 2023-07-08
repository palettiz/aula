public class Aluno {
    String nome;
    String curso;
    int faltas;
    int nota;

    Aluno(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }

    public void darFaltas(int numFaltas) {
        if ((faltas + numFaltas) <= 50) {
            faltas += numFaltas;

        } else {

            System.out.println("Esse valor é maior que o número de faltas permitido.");
        }
    }

    public void darNota(int nota){
        this.nota = nota;
    }
}