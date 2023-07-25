package br.com.ConversorDeMoedas.main;

import br.com.ConversorDeMoedas.functions.CriaParametro;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
public class Conversor {


            public void  converteMoeda() throws IOException {
                CriaParametro criaParametro = new CriaParametro();
                String ChaveApi = "8DDHTXPWWUE1RRJS";
                System.out.println("Conversor de moedas");
                String moedaAtual = criaParametro.CriaString("moeda Atual: ").toUpperCase();
                String moedaConvertida = criaParametro.CriaString("Moeda que deseja converter: ").toUpperCase();
                double valor = criaParametro.CriaDouble("Valor para a conversão: ");
                String ApiUrl = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE" +
                        "&from_currency=" + moedaAtual +
                        "&to_currency=" + moedaConvertida +
                        "&apikey=" + ChaveApi ;

                    URL url = new URL(ApiUrl);
                    InputStream stream = url.openStream();
                    try  ( Scanner scanner = new Scanner(stream)){
                        while (scanner.hasNext()){
                            String linha = scanner.nextLine();
                            if (linha.contains("5. Exchange Rate")){
                                int startIdex = linha.indexOf(":") + 2 ;
                                int endIndex = linha.length() - 2 ;
                                String exchangeRageString = linha.substring(startIdex , endIndex).replace("\"", "");
                                double exchangeRage = Double.parseDouble(exchangeRageString);
                                double soma = valor * exchangeRage ;
                                System.out.println("O valor convertido de " + moedaAtual + " " + valor
                                    +" para " +  moedaConvertida  + " " + soma);
                                break;
                            }
                    }

            }

}
    public void nomeclaturaMoedas(){


        System.out.println("Real = BRL");
        System.out.println("Dólar = USD");
        System.out.println("Euro = EUR");
        System.out.println("Libra = GBP");
        System.out.println("Rubro = RUB");
        System.out.println("Yuan = CNH");
        System.out.println("Iene = JPY");



    }
}

