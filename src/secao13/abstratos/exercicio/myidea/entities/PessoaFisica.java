package secao13.abstratos.exercicio.myidea.entities;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;

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

		double taxaImpostoRenda;

		if (getRendaAnual() < 20000.00) {
			taxaImpostoRenda = 0.15;

		} else {
			taxaImpostoRenda = 0.25;

		}

		double impostoBruto = getRendaAnual() * taxaImpostoRenda;
		double impostoSaude = getGastosSaude() * 0.5;
		return impostoBruto - impostoSaude;

	}// fim do metodo

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome() + " $ " + String.format("%.2f", calculaImposto()));
		return sb.toString();
	}

//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("\nDados Pessoa Física");
//		sb.append("\nNome: " + getNome());
//		sb.append("\nRenda anual: $" + String.format("%.2f", getRendaAnual()));
//		sb.append("\nGastos com saúde: $" + String.format("%.2f", getGastosSaude()));
//		sb.append("\nValor do imposto: $" + String.format("%.2f", calculaImposto()));
//		return sb.toString();
//	}

}
