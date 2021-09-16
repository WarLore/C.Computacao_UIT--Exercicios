/*Crie a classe Trabalhador com os atributos matrícula, nome e salário. Crie uma outra classe com o método main e peça ao usuário para cadastrar 3 trabalhadores. Lembre-se que ninguém pode ganhar menos que um salário mínimo.*/

public class Trabalhador
{
    private String matricula;
    private String nome;
    private double salario;

    public Trabalhador(String nome, String matricula, double salario){
        setMatricula(matricula);
        setNome(nome);
        setSalario(salario);
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setSalario(double salario) {
        if(salario>=1100){
            this.salario = salario;
        } else{
            this.salario = 1100;
        }
    }

    public String toString(){
        String mensagem = String.format("NOME: %s\nMATRÍCULA: %s\nSALÁRIO: %.2f", this.nome, this.matricula, this.salario);
        return mensagem;
    }

    
}