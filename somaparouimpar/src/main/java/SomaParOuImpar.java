import java.util.ArrayList;
import java.util.Collections;

public class SomaParOuImpar {
    public static void main(String[] args) {

        ArrayList<Integer> range = new ArrayList<Integer>();

        // Lista de Números
        int[] numeros = new int[]{22, 35, 42, 122, 45, 14, 13, 54, 67, 28};

        //Seta Variáveis
        int somaimpar = 0;
        int somapar = 0;
        int contaimpar = 0;
        int contapar = 0;


        for (int i=0;i<numeros.length;i++){

            //Guarda valor no ArrayList
            range.add(numeros[i]);

            //Imprime
            System.out.print("Posição: " + i + " --> número: ");
            System.out.println(range.get(i));

            //Verifica se é par ou impar
            int operacaomat = range.get(i) % 2;
            System.out.println("O divisível é: " + operacaomat);

            //Separa os ímpares dos pares
            if(operacaomat == 1){
                somaimpar = somaimpar + range.get(i);
                System.out.println("O número " + range.get(i) + " é ímpar e está na posição: " + i);
                contaimpar++;
            } else {
                somapar = somapar + range.get(i);
                System.out.println("O número " + range.get(i) + " é par e está na posição: " + i);
                contapar++;
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Encontramos um total de: " + contaimpar + " números ímpares e a soma de ímpares deu: " + somaimpar);
        System.out.println("Encontramos um total de: " + contapar + " números pares e a soma de pares deu: " + somapar);
        Collections.sort(range);
        System.out.println("Números Ordenados por ordem crescente: " + range);
    }
}
