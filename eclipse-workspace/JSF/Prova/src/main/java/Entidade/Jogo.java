package Entidade;

import java.util.Date;

public class Jogo {

	private Integer id;
	private String nomeJogador;
	private Integer numeroAposta;
	private Integer numeroSecreto;
	private String resultado;
	private Date dataDaAposta;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public Integer getNumeroAposta() {
		return numeroAposta;
	}
	public void setNumeroAposta(Integer numeroAposta) {
		this.numeroAposta = numeroAposta;
	}
	public Integer getNumeroSecreto() {
		return numeroSecreto;
	}
	public void setNumeroSecreto(Integer numeroSecreto) {
		this.numeroSecreto = numeroSecreto;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Date getDataDaAposta() {
		return dataDaAposta;
	}
	public void setDataDaAposta(Date dataDaAposta) {
		this.dataDaAposta = dataDaAposta;
	}
}
