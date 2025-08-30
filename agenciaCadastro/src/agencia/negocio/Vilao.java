package agencia.negocio;

import java.util.ArrayList;
import java.util.List;

public class Vilao extends Heroi{

	public Vilao(String nome, String habilidades, String sexo, String localidade, int nivelPoder) {
		super(nome, habilidades, sexo, localidade, 5, nivelPoder);
	}

	@Override
    public String toString(){
        return "Nome: "+nome+
               "\nHabilidades: "+habilidades+
               "\nSexo:  "+sexo+
                "\nNivel de poder: "+nivelPoder;
    }
	
}

