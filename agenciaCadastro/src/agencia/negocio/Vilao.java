package agencia.negocio;
import java.util.ArrayList;
import java.util.List;

// Herda da classe Entidade, diferente do herói, não possui nível de ameaça
public class Vilao extends Entidade{

	public Vilao(String nome, String habilidades, String sexo, String localidade, int nivelPoder) {
		super(nome, habilidades, sexo, localidade, nivelPoder);
	}

	@Override
    public String toString(){
        return super.toString();
    }
	
}

