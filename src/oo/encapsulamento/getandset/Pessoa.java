package oo.encapsulamento.getandset;

public class Pessoa {

    private String nome;
    private String nickname;
    private int idade;

    //construtor padrão
    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNomeCompleto(){
        return this.nome + " " + this.nickname;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        //nesse caso o valor de idade passa a ser o valor
        //absoluto ou seja se passarmos um valor negativo
        //ele passará a ser positivo
        idade = Math.abs(idade);
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }

    }
}
