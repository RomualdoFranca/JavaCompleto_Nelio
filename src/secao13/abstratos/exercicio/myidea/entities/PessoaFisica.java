package secao13.abstratos.exercicio.myidea.entities;

public class PessoaFisica extends Contribuintes{

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculaImposto() {
		
		if(getRendaAnual() < 20.000) {
			
			double taxaImpostoRenda = 0.15;
			
			if(getGastosSaude() > 0.0) {
				double valorImpostoSaude = getGastosSaude() * 0.5;
				return (getRendaAnual() * taxaImpostoRenda) - valorImpostoSaude ; 
				
			}else {
				return getRendaAnual() * taxaImpostoRenda;
			}
			
		}else {
			double taxaImpostoRenda = 0.25;
			
			if(getGastosSaude() > 0.0) {
				double valorImpostoSaude = getGastosSaude() * 0.5;
				return (getRendaAnual() * taxaImpostoRenda) - valorImpostoSaude ; 
				
			}else {
				return getRendaAnual() * taxaImpostoRenda;
			}
			
		}//fim do if-else externo
		
	}//fim do metodo 
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getNome());
		sb.append("\nRenda anual: $" + String.format("%.2f", getRendaAnual()));
		sb.append("\nGastos com saúde: $" + String.format("%.2f", getGastosSaude()));
		sb.append("\nValor do imposto: $" + String.format("%.2f", calculaImposto()));
		return sb.toString();
	}

}
