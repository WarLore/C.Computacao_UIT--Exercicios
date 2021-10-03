/*Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da RAM, número de processadores e fabricante. Crie métodos de acesso público e reimplemente o método toString() da classe. Crie um construtor para passar todos os atributos durante a criação do objeto.

Crie o atributo booleano ligado e um método para ligar e desligar o computador. Todo computador quando for criado deve estar desligado. Crie o método estadoComputador que retorna se ele está ligado ou desligado.

Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores que irá receber os dados do computador pelo usuário. Depois imprima os dados dos computadores que possuem mais que 512Mb de Ram usando o método toString.*/

public class Computador{
    private int idComputador;
    private String fabricante;
    private int tamanhoHd;
    private int tamanhoRam;
    private int qtdProcessadores;
    private boolean ligado;
    private static int idContador = 0;

    public Computador(String fabricante, int tamanhoHd, int tamanhoRam, int qtdProcessadores){
        idComputador = ++idContador;
        setFabricante(fabricante);
        this.tamanhoHd = tamanhoHd;
        this.tamanhoRam = tamanhoRam;
        this.qtdProcessadores = qtdProcessadores;
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public static int quantidadeComputadores(){
        return idContador;
    }

    public String toString(){
        String mensagem = String.format("ID: %d\nFabricante: %s\nTamanho do HD: %d\nTamanho da RAM: %d\nQuantidade de Processadores: %d", this.idComputador, this.fabricante, this.tamanhoHd, this.tamanhoRam, this.qtdProcessadores);
        return mensagem;
    }

    public int getIdComputador(){
        return this.idComputador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int estadoComputador(){
        if(this.ligado){
            return 1;
        }else{
            return 0;
        }
    }

    private void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getTamanhoHd() {
        return tamanhoHd;
    }

    public void setTamanhoHd(int tamanhoHd) {
        if(tamanhoHd>0){
            this.tamanhoHd = tamanhoHd;
        }
    }

    public int getTamanhoRam() {
        return tamanhoRam;
    }

    public void setTamanhoRam(int tamanhoRam) {
        if(tamanhoRam>0){
            this.tamanhoRam = tamanhoRam; 
        }
        
    }

    public int getQtdProcessadores() {
        return qtdProcessadores;
    }

    public void setQtdProcessadores(int qtdProcessadores) {
        if(qtdProcessadores>0){
            this.qtdProcessadores = qtdProcessadores;
        }
    }

    
}