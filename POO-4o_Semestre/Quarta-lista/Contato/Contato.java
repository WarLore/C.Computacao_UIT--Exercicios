/*Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa, id autoincremento e também um booleano ativo. Crie uma classe Testa que possui um arrayList de contatos. Crie um menu para adicionar, remover, listar, listar inativos, ativar contato, bloquear contato, buscar por nome, listar por cidade, limpar agenda. Obs. Listar, listar por cidade e listar por nome só devem exibir os ativos.*/

public class Contato{
    private int idContato;
    private String nome;
    private String telefone;
    private String cidade;
    private boolean ativo;
    private static int idContador = 0;

    public Contato(String nome, String telefone, String cidade){
        idContato = ++idContador;
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }

    public String toString(){
        String mensagem = String.format("ID: %d\nNome: %s\nTelefone: %s\nCidade: %s\n", this.idContato,this.nome, this.telefone, this.cidade);
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isAtivo() {
        return ativo;
    }
}