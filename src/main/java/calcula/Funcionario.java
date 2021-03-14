package calcula;

public class Funcionario {

    //Declarando os atributos

    protected String nome;
    protected double salario;
    protected double imposto;

    //Construtor, define os parâmetros padrões ao instânciar uma classe

    public Funcionario(String nome, double salario, double imposto) {
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
    }


    //GET Retorna o valor
    //SET Altera o atributo da variavel


//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public double getSalario() {
//        return this.salario;
//    }
//
//    public double getImposto() {
//        return this.imposto;
//    }
//
//    public void setSalario(double salario) {
//        this.salario = salario;
//    }
//
//    public void setImposto(double imposto) {
//        this.imposto = imposto;
//    }


    //Meu método

    public void calculaImposto() {
        double total = (salario/100) * imposto;
        System.out.printf("\n%s você deve pagar: %.2f", nome,total);
    }

}
