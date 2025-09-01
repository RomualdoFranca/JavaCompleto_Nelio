package secao13.abstratos.exercicio.myidea.entities;

public class PessoaJuridica extends Contribuintes{
	
	private Integer numeroFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double calculaImposto() {
		
		if(numeroFuncionario > 10) {
			double taxaImposto = 0.14;
			return getRendaAnual() * taxaImposto;
		}else {
			double taxaImposto = 0.16;
			return getRendaAnual() * taxaImposto;
		}
		
	}//fim do metodo
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nDados Pessoa Jurídica");
		sb.append("\nNome Fantasia: " + getNome());
		sb.append("\nRenda anual: $" + String.format("%.2f", getRendaAnual()));
		sb.append("\nNúmeros de funcinários: $" + getNumeroFuncionario());
		sb.append("\nValor do imposto: $" + String.format("%.2f", calculaImposto()));
		return sb.toString();
	}

}//fim da classe
