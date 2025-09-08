package secao15.arquivos.model.entities;

public class Item {
	private String name;
	private Double precoUnitario;
	private Integer quantidade;

	public Item() {

	}

	public Item(String name, Double precoUnitario, Integer quantidade) {
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

}
