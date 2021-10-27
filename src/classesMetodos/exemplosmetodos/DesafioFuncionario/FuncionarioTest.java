package classesMetodos.exemplosmetodos.DesafioFuncionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Marcos";
        funcionario.idade = 55;
        funcionario.print();
        funcionario.mediaSalario(300.00,3100.00,3500.00);
    }
}
