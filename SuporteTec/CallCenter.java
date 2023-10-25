package SuporteTec;

import java.util.HashSet;
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args){
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora();

        System.out.println("Bem-vindo ao sistema de suporte Técnico.");
        System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
        Scanner scanner = new Scanner(System.in);
        String problema;
        System.out.println("Descreva o problma:");
        problema = scanner.nextLine();

        interpretadora.separarPalavras(problema);

        HashSet<String> palavrasChave = interpretadora.getPalavrasChave();
        String solucao = suporte.buscarSolucao(palavrasChave);

        System.out.println("Solução encontrada: " + solucao);

        
    }
}
