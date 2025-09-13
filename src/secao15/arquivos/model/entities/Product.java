package secao15.arquivos.model.entities;


/*
 * Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.*/

public class Product {
	private String name;
	private Double precoUnitario;
	private Integer quantidade;

	public Product() {

	}

	public Product(String name, Double precoUnitario, Integer quantidade) {
		this.name = name;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getName() {
		return name;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public Double calculaValorTotal() {
		return getPrecoUnitario() * getQuantidade();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + "," + String.format("%.2f", getPrecoUnitario()) + "," + getQuantidade());
		return sb.toString();
	}
	
	public String outSummary() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + "," + String.format("%.2f", calculaValorTotal()) );
		return sb.toString();
	}

}
