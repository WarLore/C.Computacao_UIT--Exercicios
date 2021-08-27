/*Crie uma classe Produto para representar um produto do mundo real. Sua classe deverá conter os seguintes atributos e métodos:
Um campo de dados privado do tipo String chamado nome, que representará o nome do produto.
Um campo de dados privado do tipo double chamado precoCusto, que guardará o preço de custo do produto.
Um campo de dados privado do tipo double chamado precoVenda, que guardará o preço de venda do produto.
Um campo de dados privado do tipo double chamado margemLucro, que guardará a margem de lucro do produto.
Métodos públicos get() e set() para os atributos acima. Modifique o método setPrecoVenda() para que o preço de venda não seja inferior ao preço de compra. Caso isso aconteça, exiba uma mensagem alertando o usuário.
Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do produto.
Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de lucro como percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe Produto, peça para o usuário informar os preços de custo e de venda e exiba a margem de lucro em moeda e em percentual.*/

public class Produto
{
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    //GETTERS e SETTERS
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setPrecoCusto(double precoCusto)
    {
        this.precoCusto = precoCusto;
    }

    public double getPrecoCusto()
    {
        return this.precoCusto;
    }

    public void setPrecoVenda(double precoVenda)
    {
        if(getPrecoCusto()<=precoVenda){
            this.precoVenda = precoVenda;
        } else{
            System.out.println("O preço de venda é menor do que o preço de custo!!!");
        }     
    }

    public double getPrecoVenda()
    {
        return this.precoVenda;
    }
    //Calcular a margem de lucro do produto em moeda
    public String calcularMargemLucro()
    {
        this.margemLucro = getPrecoVenda() - getPrecoCusto();
        if(margemLucro>=0){
            String resultado = String.format("%.2f", margemLucro);
            return resultado;
        } else{
            return "0";
        }
    }
    //Calcular a margem de lucro do produto em porcentagem
    public String getMargemLucroPorcentagem()
    {
        if(this.margemLucro >=0){
            double margemLucroPorcentagem = (margemLucro / getPrecoCusto()) * 100;
            String resultado = String.format("%.1f", margemLucroPorcentagem);
            return resultado;
        } else{
            return "0";
        }
    }
}