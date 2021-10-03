/*Questão 5 – 5 pontos - Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).*/

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
        if(this.pessoasPresentes<this.capacidadeElevador){
            this.pessoasPresentes++;
        }
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
        if(this.pessoasPresentes>0){
            this.pessoasPresentes--;
        }
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
        if(this.andarAtual<this.capacidadeElevador){
            this.andarAtual++;
        }
    }
    //Subir até um andar específico
    public void subir(int andar){
        if(andar<=this.capacidadeElevador && this.andarAtual<andar){
            this.andarAtual = andar; 
        }
    }
    //Descer um andar
    public void descer(){
        if(this.andarAtual>0){
            this.andarAtual--;
        } else{
            this.andarAtual = 0;
        }
    }
    //Descer até um andar específico
    public void descer(int andar){
        if(this.andarAtual>0 && andar>=0 && this.andarAtual>andar){
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

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}