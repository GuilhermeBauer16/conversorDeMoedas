package br.com.ConversorDeMoedas.main;

import br.com.ConversorDeMoedas.functions.CriaParametro;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
public class Conversor {

    private static final ArrayList<moeda> moedasConhecidas = new ArrayList<>();

        static {
            moedasConhecidas.add( new moeda("BRL" , "Real"));
            moedasConhecidas.add( new moeda("USD", "Dólar"));
            moedasConhecidas.add( new moeda("EUR", "Euro"));
            moedasConhecidas.add( new moeda("GBP","Libra"));
            moedasConhecidas.add( new moeda("RUB","Rubro"));
            moedasConhecidas.add( new moeda("CNH", "Yuan"));
            moedasConhecidas.add( new moeda("JPY","Iene"));
            moedasConhecidas.add( new moeda("ARS","Peso Argentino"));
        }

    public void  converteMoeda() throws IOException {
        double valor = 0.0;
        CriaParametro criaParametro = new CriaParametro();
        String ChaveApi = "8DDHTXPWWUE1RRJS";

        while (true) {
            String moedaAtual = criaParametro.CriaString("moeda Atual: ").toUpperCase();
            String moedaConvertida = criaParametro.CriaString("Moeda que deseja converter: ").toUpperCase();

            if (!moedasConhecidas.contains(new moeda(moedaAtual , "")) || !moedasConhecidas.contains(new moeda(moedaConvertida , ""))) {
                System.out.println("A nomenclatura está errada. Por favor, verifique.");

            }else {
                valor = criaParametro.CriaDouble("Valor para a conversão: ");
            }

                String ApiUrl = "https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE" +
                    "&from_currency=" + moedaAtual +
                    "&to_currency=" + moedaConvertida +
                    "&apikey=" + ChaveApi;

                URL url = new URL(ApiUrl);
                InputStream stream = url.openStream();
                try (Scanner scanner = new Scanner(stream)) {
                    while (scanner.hasNext()) {
                        String linha = scanner.nextLine();
                        if (linha.contains("5. Exchange Rate")) {
                            int startIdex = linha.indexOf(":") + 2;
                            int endIndex = linha.length() - 2;
                            String exchangeRageString = linha.substring(startIdex, endIndex).replace("\"", "");
                            double exchangeRage = Double.parseDouble(exchangeRageString);
                            double soma = valor * exchangeRage;
                            System.out.println("O valor convertido de " + moedaAtual + " " + valor
                                    + " para " + moedaConvertida + " " + soma);
                            break;
                        }

                        String continuar = criaParametro.CriaString("Deseja continuar convertendo moedas: ").toUpperCase();
                        if (continuar.equals("N") ){
                            System.out.println("Voltando ao menu");
                            break;
                        } else if (continuar.equals("S") ) {
                                System.out.println();

                        }else {
                            System.out.println("Por favor digite S ou N");
                            }
                    }

                }catch (Exception e){
                    e.getStackTrace();
                }

            }

    }
}


