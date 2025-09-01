package secao13.abstratos.exercicio.myidea.entities;

public abstract class Contribuintes {
	private final String nome;
	private Double rendaAnual;
	
	public Contribuintes() {
		this.nome = "";
		
	}

	public Contribuintes(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}
	

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract double calculaImposto();
	

}
