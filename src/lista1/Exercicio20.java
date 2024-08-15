package lista1;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] respostas = new String[]{"Windows Server", "Unix", "Linux", "Netwate", "Mac OS", "Outro"};
        int[] votos = new int[6];

        System.out.println("""
                Qual o melhor Sistema Operacional para uso em servidores?
                As possíveis respostas são:
                1- Windows Server
                2- Unix
                3- Linux
                4- Netware
                5- Mac OS
                6- Outro""");

        int voto;
        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();
            if (voto >= 1 && voto <= 6) votos[voto - 1]++;
            else if (voto != 0) System.out.println("Valor invalido!");

        } while (voto != 0);

        int total = 0;
        for (int valor : votos) total += valor;

        System.out.println("Sistema Operacional Votos Prct %");
        System.out.println("------------------- ----- ------");
        for (int i = 0; i <= 5; i++) {
            System.out.printf("%-19s %-5d %-4.2f%%\n", respostas[i], votos[i], (double) (votos[i] * 100) / total);
        }
        System.out.println("------------------- ----- ------");
        System.out.printf("%-19s %-5d\n", "Total", total);

        scanner.close();
    }
}