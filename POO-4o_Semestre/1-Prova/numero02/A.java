/*retorna true se o valor proposto no parâmetro de m for maior que zero. O método retorna false se o
valor proposto no parâmetro de m for menor ou igual à zero. Se o método retornar true então ele
deve, também, alterar o valor do atributo a para 10 vezes o valor proposto no parâmetro do método
m.*/
public class A {
    int a;
    public boolean m(int valor) {
        if(valor>0){
            a = 10 * valor;
            return true;
        } else{
            return false;
        }
    }
}