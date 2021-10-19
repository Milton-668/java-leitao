package oo.composicao.muitosparamuitos;

public class CursoTest1 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Romario");
        Aluno aluno2 = new Aluno("Leonardo");
        Aluno aluno3 = new Aluno("Lucas");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Spring Rest");
        Curso curso3 = new Curso("Angular");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Curso " + curso3.nome + "...");
            System.out.println("Meu nome eh: " + aluno.nome);
        }
        System.out.println("\n---Alunos por cursos---\n");
        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Jav");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        } else {
            System.out.println("\nNão encontrado!");
        }
    }
}
