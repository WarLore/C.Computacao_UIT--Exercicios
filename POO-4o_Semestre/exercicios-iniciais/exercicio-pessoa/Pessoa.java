/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, sexo, peso e altura. Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular o imc da pessoa e outro método que retorne string se está abaixo, acima ou no peso ideal. Faça o teste com duas pessoas passando os valores por get e set.*/

public class Pessoa
{
    private String nome;
    private String sexo;
    private double peso;
    private double altura;

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
        if(sexo.equals("M") || sexo.equals("F")){
            this.sexo = sexo;
        }
    }

    public String getSexo()
    {
        return this.sexo;
    }

    public void setPeso(double peso)
    {
        if(peso>0){
            this.peso = peso;
        }     
    }

    public double getPeso()
    {
        return this.peso;
    }

    public void setAltura(double altura)
    {
        if(altura > 0){
            this.altura = altura;
        }
    }

    public double getAltura()
    {
        return this.altura;
    }

    public String imprimirDados()
    {
        return "\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nPeso: " + getPeso() +
                "\nAltura: " + getAltura();
    }

    public double calcularIMC()
    {
        double imc = this.peso/(Math.pow(this.altura, 2));
        return imc;
    }

    public String informarCondicao()
    {
        if(calcularIMC()<=18.5){
            return "\nEstá abaixo do peso.";
        } else if(calcularIMC()>18.5 && calcularIMC()<=24.9){
            return "\nEstá no peso normal.";
        } else{
            return "\nEsta acima do peso.";
        }
    }
}