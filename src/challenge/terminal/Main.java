package challenge.terminal;

import challenge.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador meuContador = new Contador();

        System.out.print("Escreva o primeiro parâmetro numérico: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Escreva o segundo parâmetro numérico: ");
        int parametroDois = scanner.nextInt();

        try {
            meuContador.contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro número deve ser maior que o segundo");
        }
    }
}
