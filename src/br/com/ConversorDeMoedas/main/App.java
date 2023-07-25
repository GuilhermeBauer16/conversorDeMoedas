package br.com.ConversorDeMoedas.main;
import br.com.ConversorDeMoedas.functions.LimpaTerminal;
import br.com.ConversorDeMoedas.functions.CriaParametro;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String ChaveApi = "8DDHTXPWWUE1RRJS";
        String MoedaAtual = "USD";
        String TrasferidaMoeda = "EUR";

        String ApiUrl = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE" +
                        "&from_currency=" + MoedaAtual +
                                "&to_currency=" + TrasferidaMoeda +
                                "&apikey=" + ChaveApi ;

        URL url = new URL(ApiUrl);

        CriaParametro criaParametro = new CriaParametro();
        System.out.println("Hello, World!");
//      String nome = criaParametro.CriaString("nome: ");
        int idade = criaParametro.CriaInt("Número: ");
        LimpaTerminal limpaTerminal = new LimpaTerminal();
        limpaTerminal.ApagaTerminal();
        Thread.sleep(1000);

    }
}

