import java.util.Random;

/*Criar um array de inteiros com 10 posições, adicionar números aleatórios de 1 a 100 neste array. Após mostrar o maior elemento.*/
public class Main {
    public static void main(String[] args){
        int maior, i;
        Random numRandom = new Random();
        int[] vetNum = new int[10];

        for(i = 0; i<vetNum.length; i++){
            vetNum[i] = numRandom.nextInt(100);
        }

        maior = vetNum[0];

        for(i = 1; i<vetNum.length; i++){
            if(vetNum[i]>maior){
                maior = vetNum[i];
            }
        }

        System.out.printf("O maior elemento é o %d", maior);
    }
}
