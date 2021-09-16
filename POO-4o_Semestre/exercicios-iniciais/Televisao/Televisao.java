/*Crie uma classe Televisao com métodos que podem controlar o volume e trocar os canais da televisão. A TV só funciona ligada e deve ter limites de volume e canais. Os canais ao chegar no último volta para o primeiro. Crie os seguintes controles: aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado ou subir um canal caso não seja informado o canal; consultar o valor do volume de som e o canal selecionado. Crie dois construtores para a TV, um que recebe apenas a marcad da TV e outro que recebe a marca, quantidade de canais e volume máximo. Crie o método toString que mostrará a marca da TV, o volume e o canal atual. Crie menu para interagir com a TV. Utilize métodos Get e Set.*/

public class Televisao
{
    private String marca;
    private int quantidadeCanais;
    private int canalAtual;
    private int volumeMaximo;
    private int volume;
    private boolean ligado;
    

    public Televisao(String marca){
        setMarca(marca);
    }

    public Televisao(String marca, int quantidadeCanais, int volumeMaximo){
        setMarca(marca);
        setQuantidadeCanais(quantidadeCanais);
        setVolumeMaximo(volumeMaximo);
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void trocarCanal(){
        
        canalAtual = (canalAtual % quantidadeCanais) + 1;
    }

    public void trocarCanal(int canal){
        
    }

    public void aumentarVolume(int volume){
        if(volume>0 && volume<=this.volumeMaximo){
            if(this.volume+volume > this.volumeMaximo){
                this.volume = this.volumeMaximo;
            } else{
                this.volume += volume;
            }
        }
    }

    public void diminiuirVolume(int volume){
        if(volume>0 && volume<=this.volumeMaximo){
            if(this.volume-volume < 0){
                this.volume = 0;
            } else{
                this.volume -= volume;
            }
        }
    }
    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeCanais() {
        return quantidadeCanais;
    }

    private void setQuantidadeCanais(int quantidadeCanais) {
        this.quantidadeCanais = quantidadeCanais;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

    private void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }

    

    
}