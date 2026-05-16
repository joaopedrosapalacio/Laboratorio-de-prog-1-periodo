import java.util.Scanner;

public class sistemaAcademicoCompleto {
    /**
     * 
     * @author João Pedro Sapalácio
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomes[] = new String[5];
        double nota[] = new double[5];
        double nota2[] = new double[5];
        double media[] = new double[5];

        int i;
        double soma = 0;
        double maiorMedia = 0;
        String melhorAluno = "";

        for (i = 0; i < 5; i++){
            System.out.println("Coloque os nomes dos alunos");
            nomes[i] = scanner.nextLine();

            System.out.println("Coloque a nota da primeira prova");
            nota[i] = scanner.nextDouble();

            System.out.println("Coloque a nota da segunda prova");
            nota2[i] = scanner.nextDouble();
            scanner.nextLine();

            media[i] = (nota[i] + nota2[i]) /2;
            soma += media[i];

            if (media[i] >= 7){
                System.out.println("Aprovado");
            } else if (media[i] >= 5) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado");
            }
            if (media[i] > maiorMedia){
                maiorMedia = media[i];
                melhorAluno = nomes[i];
            }
        }
        double mediaGeral = soma / 5;

        System.out.println("A maior media e: " + maiorMedia);
        System.out.println("O melhor aluno foi: " + melhorAluno);
        System.out.println("Media geral da turma e: " + mediaGeral);
    }
}
