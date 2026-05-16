import java.util.Scanner;

public class sistemaVendaLoja {
/**
 * 
 * @author João Pedro Sapalácio
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz[][] = new int [5][4];
        int i;
        int j;
        int maior = 0;
        int soma = 0;
        int somaVendedor = 0;

        System.out.println("Coloque as vendas");

        for (i = 0; i < matriz.length; i++){
            somaVendedor = 0;
            for (j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
                somaVendedor += matriz[i][j];

                }
                soma += somaVendedor;
                System.out.println("Total vendido por vendedor: " + somaVendedor);
                if (somaVendedor > maior){
                    maior = i;
                }
                if (somaVendedor > 5000){
                    System.out.println("Meta atingida");
                }
            }
            double media = soma / 20;
            System.out.println("Vendedor com maior venda: " + i);
            System.out.println("Media geral de vendas: " + media);
    }
}