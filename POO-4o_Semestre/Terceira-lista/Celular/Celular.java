import java.util.Random;

/*Criar uma classe celular com os seguintes
 campos: modelo, nivelBateria, 
 ligado (tipo boolean) e volume.
 O usuário pode carregar o celular,
 aumentar e diminuir o volume e jogar, ao 
 jogar ele poderá escolher o jogo e a
 bateria deverá gastar quando jogar.
O jogo deverá ser um par ou impar onde 
o usuário escolher (par ou impar) e 
o sistema gera um número aleatorio e diz
se ganhou ou perdeu.
O usuário volumeente poderá controlar o volume
e jogar se o celular estiver ligado.
Criar uma classe TestaCelular e criar 
um menu para o usuário interagir.*/

/*Modifique a classe celular e altere o jogo para poder jogar Pedra, Papel e Tesoura. Também deverá ser criado um campo Id celular que deverá ser incrementado automaticamente e também um método estático mostraQtdeCelulares() que retorna quantos celulares estão instanciados!*/

public class Celular
{
    private String modelo;
    private int nivelBateria;
    private boolean ligado;
    private int volume;
    private int idCelular;
    private static int idContador=1;

    public Celular(String modelo, int nivelBateria, int nivelVolume){
        idCelular=idContador;
        idContador++;
        setModelo(modelo);
        setNivelBateria(nivelBateria);
        setVolume(nivelVolume); 
    }

    public Celular(String modelo, int nivelBateria){

    }

    private void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    private void setNivelBateria(int nivelBateria) {
        if(nivelBateria>0 && nivelBateria<=100){
            this.nivelBateria = nivelBateria;
        }
    }

    public int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume){
        if(volume>=0 && volume<=100){
            this.volume = volume;
        } else {
            this.volume = 0;
        }
    }

    public int getIdCelular(){
        return this.idCelular;
    }

    public void carregarBateria(){
        if(this.nivelBateria<100){
            this.nivelBateria++;
        }
    }

    public boolean isLigado(){
        return this.ligado;
    }

    public void ligar() {
        if(this.nivelBateria > 0){
            this.ligado = true;
        } else{
            this.ligado = false;
        }
    }
    
    public void aumentarVolume(int volume) {
        if(this.nivelBateria>0 && this.ligado == true){
            if(volume>0 && volume<=100){
                if((this.volume+volume)>100){
                    this.volume = 100;
                } else{
                    this.volume += volume;
                } 
            }
        }
    }

    public void diminuirVolume(int volume){
        if(this.nivelBateria>0 && this.ligado == true){
            if(volume>0 && volume<=100){
                if((this.volume-volume)<0){
                    this.volume = 0;
                } else{
                    this.volume -= volume;
                } 
            }
        } 
    }

    public int jogar(int escolhaJogador){
            Random numeroRandom = new Random();
            int escolhaPC = numeroRandom.nextInt(3);
            this.nivelBateria--;
            if(escolhaPC!=escolhaJogador){
                if((escolhaJogador==0 && escolhaPC==1) || (escolhaJogador==1 && escolhaPC==2) || (escolhaJogador==2 && escolhaPC==0)){
                    return 0; //O jogador perdeu
                } else{
                    return 1; // O jogador venceu
                }
            } else{
                return 2; // Houve empate
            }
    }

    public static String mostraQtdeCelulares(){
        return String.format("A quantidade de celulares é %d", idContador-1);
    }

    public String toString(){
        String mensagem = String.format("Modelo: %s\nID: %d\nNivel da batéria: %d%%\nVolume atual: %d\n", this.modelo, this.idCelular, this.nivelBateria, this.volume);
        return mensagem;
    }
}
