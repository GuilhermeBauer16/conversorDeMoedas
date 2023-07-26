package br.com.ConversorDeMoedas.functions;
import java.util.Scanner;

public class CriaParametro {
    public Scanner scanner;

    public CriaParametro() {
        scanner = new Scanner(System.in);
    }

    public String CriaString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public int CriaInt(String mensagem) {
        int numero = 0;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Por favor digite um número");
                scanner.nextLine();
            }
        }
        return numero;
    }

    public double CriaDouble(String mensagem) {
        double numeroDouble = 0.0;
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                numeroDouble = scanner.nextDouble();
                break;
            } else {
                System.out.print("Por favor digite um número válido: ");
                scanner.nextLine();
            }
        }
        return numeroDouble;
    }

    public String titulo(String mensagem, int numero) {
        String linha = "==".repeat(numero);
        return linha + "\n" + mensagem + "\n" + linha;
    }

    public String linha(int numero) {
        return "==".repeat(numero);
    }
}