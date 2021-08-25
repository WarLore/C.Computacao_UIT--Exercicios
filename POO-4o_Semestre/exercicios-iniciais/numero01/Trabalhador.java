/*Crie a classe Trabalhador com os atributos matrícula, nome e salário. Crie uma outra classe com o método main e peça ao usuário para cadastrar 3 trabalhadores. Lembre-se que ninguém pode ganhar menos que um salário mínimo.*/

public class Trabalhador
{
    private int matricula;
    private String nome;
    private double salario;

    //GETTERS E SETTERS
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setSalario(double salario)
    {
        if(salario>=1100){
            this.salario = salario;
        } else{
            this.salario = 1100;
        }
    }

    public double getSalario()
    {
        return this.salario;
    }
    //Método para imprimir os dados
    public String imprimirDados()
    {
        return "\nMatricula: " + getMatricula() +
                "\nNome: " + getNome() +
                "\nSalário(R$): " + getSalario();
    }
}