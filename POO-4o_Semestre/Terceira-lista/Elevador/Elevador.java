/*Refazer o exercício do elevador da prova para ele não poder subir ou descer sem pessoas dentro do elevador. Modifique as opções para que possa escolher quantos andares subir ou descer e quantas pessoas irão entrar ou sair através de sobrecarga.*/

public class Elevador
{
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    public Elevador(int capacidadeElevador, int totalAndares){
        setCapacidadeElevador(capacidadeElevador);
        setTotalAndares(totalAndares);
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }
    //Entrar apenas uma pessoa
    public void entrar(){
        this.entrar(1);
    }
    //Entrar mais de uma pessoa
    public void entrar(int quantidadePessoas){
        if(this.pessoasPresentes<this.capacidadeElevador){
            if(this.pessoasPresentes+quantidadePessoas <= this.capacidadeElevador){
                this.pessoasPresentes += quantidadePessoas;
            } else{
                this.pessoasPresentes = this.capacidadeElevador;
            }
        }
    }
    //Sair apenas uma pessoa
    public void remover(){
        this.remover(1);
    }
    //Sair mais de uma pessoa
    public void remover(int quantidadePessoas){
        if(this.pessoasPresentes>0){
            if(this.pessoasPresentes-quantidadePessoas >= 0){
                this.pessoasPresentes -= quantidadePessoas;
            } else{
                this.pessoasPresentes = 0;
            }
        }
    }
    //Subir um andar
    public void subir(){
        if(this.pessoasPresentes>0){
            if(this.andarAtual<this.capacidadeElevador){
                this.andarAtual++;
            }
        }
    }
    //Subir até um andar específico
    public void subir(int andar){
        if(andar<=this.capacidadeElevador && this.andarAtual<andar && this.pessoasPresentes>0){
            this.andarAtual = andar; 
        }
    }
    //Descer um andar
    public void descer(){
        if(this.andarAtual>0 && this.pessoasPresentes>0){
            this.andarAtual--;
        }
    }
    
    //Descer até um andar específico
    public void descer(int andar){
        if(this.andarAtual>0 && andar>=0 && this.andarAtual>andar && this.pessoasPresentes>0){
            this.andarAtual = andar;
        }
    }
    //Imprimir dados
    public String toString() {
        String mensagem = String.format("Quantidade de pessoas: %d\nAndar atual: %d\n", this.pessoasPresentes, this.andarAtual);
        return mensagem;
    }
    //GETTERS e SETTERS
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    private void setTotalAndares(int totalAndares) {
        if(totalAndares>0){
            this.totalAndares = totalAndares;
        }  
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    private void setCapacidadeElevador(int capacidadeElevador) {
        if(capacidadeElevador>0){
            this.capacidadeElevador = capacidadeElevador;
        }
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}