package br.com.ConversorDeMoedas.main;
import br.com.ConversorDeMoedas.functions.CriaParametro;
import br.com.ConversorDeMoedas.functions.LimpaTerminal;

public class App {
    public static void main(String[] args) throws Exception {

        Conversor conversor = new Conversor();
        CriaParametro criaParametro = new CriaParametro();
        while (true) {
            System.out.println(criaParametro.titulo("conversor Moedas", 30));
            System.out.println("[1]Coverter moedas");
            System.out.println("[2]ver nomeclatura das moedas ");
            System.out.println("[3]Sair");
            System.out.println(criaParametro.linha(30));
            int opcao = criaParametro.CriaInt("sua opcão: ");

            if (opcao == 1) {
                System.out.println(criaParametro.titulo("Converter moedas", 30));
                conversor.converteMoeda();
            } else if (opcao == 2) {
                System.out.println(criaParametro.titulo("Nomeclatura das moedas", 30));
                conversor.mostraMoedas();

            } else if (opcao == 3) {

                System.out.println("Saindo...");
                Thread.sleep(1000);
                break;

            } else {
                System.out.println("digite uma opção valida!");
            }
        }
    }
}
