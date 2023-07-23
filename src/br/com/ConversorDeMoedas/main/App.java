package br.com.ConversorDeMoedas.main;
import br.com.ConversorDeMoedas.functions.LimpaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LimpaTerminal limpaTerminal = new LimpaTerminal();
        limpaTerminal.ApagaTerminal();
        Thread.sleep(1000);
        System.out.println("Hello, World!");
    }
}

