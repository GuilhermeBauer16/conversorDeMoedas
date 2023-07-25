package br.com.ConversorDeMoedas.main;
import br.com.ConversorDeMoedas.functions.CriaParametro;
import br.com.ConversorDeMoedas.functions.LimpaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        LimpaTerminal limpaTerminal = new LimpaTerminal();
        Conversor conversor = new Conversor();
        CriaParametro criaParametro = new CriaParametro();
        while (true) {
            System.out.println("[1]Coverter moedas");
            System.out.println("[2]ver nomeclatura das moedas ");
            System.out.println("[3]Sair");
            int opcao = criaParametro.CriaInt("sua opcão: ");
            if (opcao == 1){
                conversor.converteMoeda();

            }else if (opcao == 2){
                conversor.nomeclaturaMoedas();

            } else if (opcao == 3) {

                System.out.println("Saindo...");
                Thread.sleep(1000);
                break;

            }else {
                System.out.println("digite uma opção valida!");
            }

        }

    }
}

