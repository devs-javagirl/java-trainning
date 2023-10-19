import java.sql.Array;

public class Main {

    public static int particionaLomuto(Integer[] array, int inicio, int fim){
        /*escolhe o pivot, estamos escolhendo  o primeiro elemento, mas poderia ser aleatório
        o sucesso do quicksort está em escolher um bom pivot, e para isso existem algumas estratégias*/
        int pivot = array[inicio];

        int posicaoMenor = inicio + 1;

        /*particiona o array deixando o pivot no "meio"
        percorre o array até encontrar um elemento menor ou igual ao pivot*/
        for(int i = inicio + 1; i <= fim; i++){

            if(array[i] <= pivot){
                /*coloca o elemento na frente do pivot e o elemento que estava ali vai para a posição do elemento que foi encontrado*/
                troca(array, i, posicaoMenor);
                posicaoMenor +=1;
            }
        }
        /*coloca o pivot na posição logo após seus elementos menores*/
        troca(array, inicio, posicaoMenor - 1);

        /*retorna posição atual do pivot*/
        return posicaoMenor - 1;
    }

    public static void troca(Integer[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void quickSort(Integer[] array, int inicio, int fim){
        /*condição de parada da função recursiva*/
        if(inicio < fim){

            /*chamada da função de particionamento baseada no método Lomuto*/
            int pivot = particionaLomuto(array, inicio, fim);

            /*a chamada dupla recursiva à função quicksort, na primeira chamada mandamos o lado "direto" do pivot
             *na segunda chamada mandamos o lado "esquerdo" do pivot*/
            quickSort(array, inicio, pivot-1);
            quickSort(array, pivot+1, fim);
        }
    }

    public static void main(String args[]){

        Integer array[] = {4, -4, 6, 10, 0, -1, 2, 8, 50, 0, 32, 1, -1, 4};
        quickSort(array, 0, array.length-1);

        for(int i =0; i< array.length; i++){
            System.out.print(" " + array[i]);
        }

    }

}
