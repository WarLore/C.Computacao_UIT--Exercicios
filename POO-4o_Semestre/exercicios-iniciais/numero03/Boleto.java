/*Crie a classe Boleto com os atributos vencimento, valor, desconto, um booleano se está pago e nome do cliente. Crie um construtor para que todos dados sejam passados no momento da instanciação dos objetos. Crie um método que retorne o valor líquido do boleto. Crie também um método pagar que altera o boleto para pago.*/

public class Boleto
{
    private String nomeCliente;
    private String vencimento;
    private double valor;
    private double desconto;
    private boolean boletoPago;

    public Boleto(String nomeCliente, String vencimento, double valor, double desconto)
    {
        this.nomeCliente = nomeCliente;
        this.vencimento = vencimento;
        this.valor = valor;
        this.desconto = desconto;
        this.boletoPago = false;
    }

    public double calcularValorLiquido()
    {
        if(this.valor >= this.desconto){
            return this.valor-this.desconto;
        } else{
            return 0;
        }
        
    }

    public void pagarBoleto()
    {
        this.boletoPago = true;
    }

    public String verificarPagamento()
    {
        if(this.boletoPago){
            return "\n\nO BOLETO FOI PAGO.";
        } else{
            return "\n\nO BOLETO AINDA NÃO FOI PAGO.";
        }
    }

    public String imprimirDados()
    {
        return "\nNome: " + this.nomeCliente +
                "\nVencimento do boleto: " + this.vencimento +
                "\nValor do boleto: " + this.valor +
                "\nValor do desconto: " + this.desconto +
                "\nValor líquido: " + calcularValorLiquido() +
                verificarPagamento();
                
    }


}