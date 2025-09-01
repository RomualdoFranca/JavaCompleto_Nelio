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
			
			double taxaImpostoRenda = 0.0;
			double valorImpostoSaude = getGastosSaude() * 0.5;
			
			if(getGastosSaude() > 0.0) {
				taxaImpostoRenda = 0.15;
				double valorImpostoRenda = getRendaAnual() * 0.15;
				
				return getRendaAnual() - (valorImpostoRenda - valorImpostoSaude);
			}else {
				return getRendaAnual() - valorImpostoRenda;
			}
			
		}else {
			
		}
		return 0;
	}

}
