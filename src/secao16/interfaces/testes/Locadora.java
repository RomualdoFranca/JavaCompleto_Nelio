package secao16.interfaces.testes;

import java.time.Duration;
import java.time.LocalDateTime;

public class Locadora {
	private String modelo;
	private LocalDateTime retirada;
	private LocalDateTime devolucao;
	private Double precoHora;
	private Double precoDia;

	public Locadora() {

	}

	public Locadora(String modelo, LocalDateTime retirada, LocalDateTime devolucao, Double precoHora, Double precoDia) {
		this.modelo = modelo;
		this.retirada = retirada;
		this.devolucao = devolucao;
		this.precoHora = precoHora;
		this.precoDia = precoDia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDateTime getRetirada() {
		return retirada;
	}

	public void setRetirada(LocalDateTime retirada) {
		this.retirada = retirada;
	}

	public LocalDateTime getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(LocalDateTime devolucao) {
		this.devolucao = devolucao;
	}

	public Double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	public Double getPrecoDia() {
		return precoDia;
	}

	public void setPrecoDia(Double precoDia) {
		this.precoDia = precoDia;
	}
	
//	public long duracao() {
//		Duration duracao = Duration.between(retirada, devolucao);
//		
//		long duracaoDias = duracao.toDays();
//		long duracaoHoras = duracao.toHours();
//		long duracaoMinutos = duracao.toMinutes();
//		
//		if(duracaoHoras >= 12 || duracaoHoras <= 23) {
//			
//			if(duracaoMinutos != 0) {
//				duracaoDias += 1;
//				return duracaoDias;
//				
//			}else {
//				
//				return duracaoHoras;
//			}
//			
//		}else if(duracaoDias != 0 ) {
//			if(duracaoHoras !=)
//		}
//		
//		
//		return inicio;
//	}

}
