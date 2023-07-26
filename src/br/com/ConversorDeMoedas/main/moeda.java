package br.com.ConversorDeMoedas.main;
import java.util.Objects;
public class moeda {
    private String nomeMoeda;
    private String nomeclatura;

    public moeda(String nomeclatura  , String nomeMoeda ){
        this.nomeMoeda = nomeMoeda;
        this.nomeclatura = nomeclatura;
    }
    public  moeda(String nomeclatura){
        this.nomeclatura = nomeclatura;
    }
    public String getNomeclatura() {
        return nomeclatura;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

    public void setNomeclatura(String nomeclatura) {
        this.nomeclatura = nomeclatura;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        moeda moeda = (moeda) obj;
        return Objects.equals(nomeclatura, moeda.nomeclatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeclatura);
    }
}

