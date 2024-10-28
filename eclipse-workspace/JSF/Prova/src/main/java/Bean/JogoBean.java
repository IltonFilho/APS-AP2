package Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entidade.Jogo;

@ManagedBean
@SessionScoped
public class JogoBean {

	private Jogo jogo = new Jogo();
	private List<Jogo> jogos = new ArrayList<>();
	private Integer id = 1;
	
	public String salvar() {
		jogo.setId(id++);
		jogo.setDataDaAposta(new Date());
		jogo.setNumeroSecreto(new Random().nextInt(5) + 1);

		if (jogo.getNumeroAposta().equals(jogo.getNumeroSecreto())) {
			jogo.setResultado("Acertou");
		} else {
			jogo.setResultado("Não Acertou");
		}

		jogos.add(jogo);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Jogo Salvo com Sucesso!", ""));
		jogo = new Jogo();
		
		return "Listagem.xhtml";
	}
	
	public void excluirJogo(Jogo jogo) {
		jogos.remove(jogo);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Jogo Excluído com Sucesso!", ""));
	}

	public void exibirQuantidadeJogos() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Quantidade de Jogos: ", String.valueOf(jogos.size())));
	}
	
	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
}
