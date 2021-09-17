/*Crie a classe mochila que possui os atributos nome, 
quantidadeItensAtual, quantidadeItensMaxima, pesoAtual, pesoMaximo. Criar um construtor onde é necessário passar o nome da mochila e o peso e quantidade de itens que ela suporta. Deverá existir um método inserir itens onde é passado o peso do item que está sendo inserido. Também deverá ter um método que retorna a situação da atual da mochila. Criar uma classe de teste e testar tentando inserir vários itens na mochila.*/

public class Mochila
{
    private String nome;
    private int quantidadeItensAtual;
    private int quantidadeItensMaxima;
    private double pesoAtual;
    private double pesoMaximo;

    public Mochila(String nome, double pesoMaximo, int quantidadeItensMaxima){
        setNome(nome);
        setPesoMaximo(pesoMaximo);
        setQuantidadeItensMaxima(quantidadeItensMaxima);
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    private void setPesoMaximo(double pesoMaximo){
        this.pesoMaximo = pesoMaximo;
    }

    private void setQuantidadeItensMaxima(int quantidadeItensMaxima){
        this.quantidadeItensMaxima = quantidadeItensMaxima;
    }

    public void inserirItens(double peso){
        if(peso>0 && peso<=this.pesoMaximo && this.quantidadeItensAtual<this.quantidadeItensMaxima){
            if(this.pesoAtual + peso <= this.pesoMaximo)
            {
                this.pesoAtual += peso;
                this.quantidadeItensAtual++;
            }
            
        }
    }

    public String toString(){
        String mensagem = String.format("NOME: %s\nQUANTIDADE DE ITENS: %d\nQUANTIDADE MÁXIMA DE ITENS: %d\nPESO ATUAL: %.2f\nPESO MÁXIMO: %.2f", this.nome, this.quantidadeItensAtual, this.quantidadeItensMaxima, this.pesoAtual, this.pesoMaximo);
        return mensagem;
    }
}