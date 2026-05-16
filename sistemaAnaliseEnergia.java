import java.util.Scanner;

public class sistemaAnaliseEnergia {
    /**
     * 
     * @author João Pedro Sapalácio
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        int i;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        
        System.out.println("Registre o consumo de energeticos");
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];

            if (vetor[i] > 100){
                System.out.println("Consumo Critico");
            }

            if (i == 0){
                maior = vetor[0];
                menor = vetor[0];
            } else {
                if (vetor[i] > maior){
                    maior = vetor[i];
                }
                if (vetor[i] < menor){
                    menor = vetor[i];
                }
            }
        }
        int media = soma / 10;
        for (i = 0; i < vetor.length; i++){
            if (vetor[i] > media){
                System.out.println("O dia: " + i + " esta acima da media");
            }
        }
        System.out.println("Media de consumo " + media);
        System.out.println("Maior consumo " + maior);
        System.out.println("Menor consumo " + menor);
    }
}
