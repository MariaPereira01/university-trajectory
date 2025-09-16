 import java.util.Scanner;

public class CalculadoraNotas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TotalAlunos = 0;
        System.out.println("=== SISTEMA DE NOTAS - VERSÃO 2.0 === ")
        while (true) {
        System.out.print("Digite o nome do aluno(ou 'fim' para encerrar): ");
        String nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("fim")) {
            break;
        }
        System.out.print("Digite a primeira nota: ");
        float notan1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float notan2 = scanner.nextFloat();

        scanner.nextLine();
        float media = (notan1 + notan2) / 2f;

        String situacao;
        if (media >= 7.0) {
            situacao = "APROVADO POR MÉDIA";
        } else if(media >= 5.0 && media < 7.0 ) {
            //segundo if condicao
            situacao = "APROVADO";
        }else {
            situacao = "REPROVADO";
        }

        float MaiorNota;
        if (notan1 > notan2) {
            MaiorNota = notan1;
        } else {
            MaiorNota = notan2;
        }

        System.out.println("--- RELATÓRIO DO ALUNO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + notan1);
        System.out.println("Nota 2: " + notan2);
        System.out.println("Média: " + media); 
        System.out.println("Situação: " + situacao);
        System.out.println("Maior nota: " + MaiorNota);

        TotalAlunos++;

        }

        System.out.println("=== RESUMO FINAL ===");
        System.out.println("Total de alunos processados: " + TotalAlunos);
        System.out.println("Programa encerrado. Obrigado por usar nosso Sistema de Notas! Mantenha-se Hidratado:)");

        scanner.close();

    }
}



