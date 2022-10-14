public class Main {
    public static void main(String[] args) {
        List < Aluno > alunos = new ArrayList < > ();
        Aluno aluno1 = new Aluno("João da Silva", 123);
        Aluno aluno2 = new Aluno("Maria Oliveira", 456);
        Aluno aluno3 = new Aluno("Pedro Souza", 789);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        Turma turma = new Turma("Matemática", "Sala 1");
        turma.setAlunos(alunos);
        System.out.println(turma);
    }