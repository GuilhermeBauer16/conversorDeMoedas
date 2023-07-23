package br.com.ConversorDeMoedas.functions;

import java.util.Scanner;

public class CriaParametro {
    public Scanner scanner;
    public CriaParametro(){
        Scanner scanner = new Scanner(System.in);
    }

    public String CriaString(String mensagem){
        System.out.print(mensagem);
        return scanner.next();
    }

    public int CriaInt(String mensagem) {
        int numero = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                System.out.print(mensagem);
                numero = scanner.nextInt();
                break;

            } else {
                System.out.print("Por favor digite um número");
                scanner.nextLine();
            }

            return numero;
        }

        public double CriaDouble(String mensagem){
            double numeroDouble = 0.0;
            while (true) {
                try {
                    System.out.print(mensagem);
                    numeroDouble = scanner.nextDouble();
                    break;

                } catch (NumberFormatException e) {
                    System.out.print("Por favor digite um número");
                    scanner.nextLine();
                }
            }
            return numeroDouble;

        }
    }

