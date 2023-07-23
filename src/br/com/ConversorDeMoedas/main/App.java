package br.com.ConversorDeMoedas.main;
import br.com.ConversorDeMoedas.functions.LimpaTerminal;
import br.com.ConversorDeMoedas.functions.CriaParametro;

public class App {
    public static void main(String[] args) throws Exception {
        CriaParametro criaParametro = new CriaParametro();
        System.out.println("Hello, World!");
//      String nome = criaParametro.CriaString("nome: ");
        int idade = criaParametro.CriaInt("Número: ");
        LimpaTerminal limpaTerminal = new LimpaTerminal();
        limpaTerminal.ApagaTerminal();
        Thread.sleep(1000);

    }
}

