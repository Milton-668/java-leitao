package classesMetodos;

public class DesafioData {

    int dia;
    int mes;
    int ano;
    //construtor padrão
    DesafioData(){
        //método this para popular o construtor
        this(1,1,1970);
    }
    //construtor manipulado através das variáveis
    DesafioData( int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada() {
        return String.format("Dia %d, mês %d, ano %d", this.dia, mes, ano);
    }
}
