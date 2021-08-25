/*Crie a classe Eleitor com os atributos idade, sexo, nome e numero do título. Faça um método que retorne se a pessoa é Obrigada, Desobrigada ou impedida de votar. Crie outra classe para testar*/

public class Eleitor
{  
    private String nome;
    private String sexo;
    private int idade;
    private int titulo;

    //GETTERS e SETTER
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setSexo(String sexo)
    {
        String charSexo = sexo.toUpperCase();
        if(charSexo.equals("F") || charSexo.equals("M")){
            this.sexo = charSexo;
        } else{
            System.out.println("Sexo inválido");
        }
        
    }

    public String getSexo()
    {
        return this.sexo;
    }

    public void setIdade(int idade)
    {
        if(idade>0){
            this.idade = idade;
        }     
    }

    public int getIdade()
    {
        return this.idade;
    }

    public void setTitulo(int titulo)
    {
        this.titulo = titulo;
    }

    public int getTitulo()
    {
        return this.titulo;
    }
    //Verificar o estado de votação do candidato
    public String verificarEstadoVotacao()
    {
        if(getIdade()<16){
            return "\nNÃO PODE VOTAR";
        } else if(getIdade()<=18 || getIdade()>60){
            return "\nVOTO FACULTATIVO";
        } else{
            return "\nVOTO OBRIGATÓRIO";
        }
    }
    //Imprimir dados do eleitor
    public String imprimirEleitor()
    {
        return "\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nIdade: " + getIdade() +
                "\nTitulo: " + getTitulo();
    }
}