public class ClasseTeste01
{
    private String nome;
    private int idade;

    public void m(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Olá "+ this.nome +", você tem "+ this.idade +" anos.";
    }
}