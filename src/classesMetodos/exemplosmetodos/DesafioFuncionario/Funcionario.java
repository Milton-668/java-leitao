package classesMetodos.exemplosmetodos.DesafioFuncionario;

import java.util.Arrays;

public class Funcionario {

    public String nome;
    public int idade;
    public double salario;

    public void print() {
        if(nome== null || idade==0){
            return;
        }
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Salario:" + this.salario);
    }

    public void mediaSalario(double... salario) {
        if (salario == null) {
            return;
        }
        double soma = 0;
        for (double sal : salario) {
            soma += sal;
        }
        double media = soma / salario.length;
        System.out.printf("Salarios do %s %s\n", this.nome, Arrays.toString(salario));
        System.out.printf("Soma dos salarios : %.2f\n", soma);
        System.out.println("Media dos salarios: " + media);
    }
}