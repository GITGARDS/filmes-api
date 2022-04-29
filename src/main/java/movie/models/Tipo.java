package movie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String tituloOriginal;
	private String tipo;
	private String classificacao;
	private Integer lancamento;
	private String duracao;
	private String genero;
	private String idiomaAudio;
	private String legendas;
	private String informacao;
	private String produtora;
	private String formato;
	private String franquia;
	private String qualidade;
	private double tamanho;
	private double criticaExpecializada;
	private String resenha;
	private String dirigido;
	private String capa;
	private String enderecoTrailer;
	private String enderecoDownload1;
	private String enderecoDownload2;
	public Tipo() {
		super();
	}
	public Tipo(Integer id, String tituloOriginal, String tipo, String classificacao, Integer lancamento,
			String duracao, String genero, String idiomaAudio, String legendas, String informacao, String produtora,
			String formato, String franquia, String qualidade, double tamanho, double criticaExpecializada,
			String resenha, String dirigido, String capa, String enderecoTrailer, String enderecoDownload1,
			String enderecoDownload2) {
		super();
		this.id = id;
		this.tituloOriginal = tituloOriginal;
		this.tipo = tipo;
		this.classificacao = classificacao;
		this.lancamento = lancamento;
		this.duracao = duracao;
		this.genero = genero;
		this.idiomaAudio = idiomaAudio;
		this.legendas = legendas;
		this.informacao = informacao;
		this.produtora = produtora;
		this.formato = formato;
		this.franquia = franquia;
		this.qualidade = qualidade;
		this.tamanho = tamanho;
		this.criticaExpecializada = criticaExpecializada;
		this.resenha = resenha;
		this.dirigido = dirigido;
		this.capa = capa;
		this.enderecoTrailer = enderecoTrailer;
		this.enderecoDownload1 = enderecoDownload1;
		this.enderecoDownload2 = enderecoDownload2;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Integer getLancamento() {
		return lancamento;
	}
	public void setLancamento(Integer lancamento) {
		this.lancamento = lancamento;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getIdiomaAudio() {
		return idiomaAudio;
	}
	public void setIdiomaAudio(String idiomaAudio) {
		this.idiomaAudio = idiomaAudio;
	}
	public String getLegendas() {
		return legendas;
	}
	public void setLegendas(String legendas) {
		this.legendas = legendas;
	}
	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getFranquia() {
		return franquia;
	}
	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}
	public String getQualidade() {
		return qualidade;
	}
	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public double getCriticaExpecializada() {
		return criticaExpecializada;
	}
	public void setCriticaExpecializada(double criticaExpecializada) {
		this.criticaExpecializada = criticaExpecializada;
	}
	public String getResenha() {
		return resenha;
	}
	public void setResenha(String resenha) {
		this.resenha = resenha;
	}
	public String getDirigido() {
		return dirigido;
	}
	public void setDirigido(String dirigido) {
		this.dirigido = dirigido;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public String getEnderecoTrailer() {
		return enderecoTrailer;
	}
	public void setEnderecoTrailer(String enderecoTrailer) {
		this.enderecoTrailer = enderecoTrailer;
	}
	public String getEnderecoDownload1() {
		return enderecoDownload1;
	}
	public void setEnderecoDownload1(String enderecoDownload1) {
		this.enderecoDownload1 = enderecoDownload1;
	}
	public String getEnderecoDownload2() {
		return enderecoDownload2;
	}
	public void setEnderecoDownload2(String enderecoDownload2) {
		this.enderecoDownload2 = enderecoDownload2;
	}
	
	
	
	
}