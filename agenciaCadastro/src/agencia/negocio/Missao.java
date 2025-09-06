package agencia.negocio;

public class Missao {
	    private Heroi heroi;
	    private Vilao vilao;
	    private String cidade;

	    public Missao(Heroi heroi, Vilao vilao, String cidade) {
	    	if (heroi == null) throw new StringVaziaException("herói");
	    	if (vilao == null) throw new StringVaziaException("vilão");
	    	if (cidade == null || cidade.trim().isEmpty()) throw new StringVaziaException("cidade");
	        this.heroi = heroi;
	        this.vilao = vilao;
	        this.cidade = cidade;
	    }

	    public Heroi getHeroi() { return heroi; }
	    public Vilao getVilao() { return vilao; }
	    public String getCidade() { return cidade; }

	    @Override
	    public String toString() {
	        return "Missão: " + heroi.getNome() + " vs " + vilao.getNome() + " em " + cidade;
	    }
	}
	
	
