package model;

public class PontodeColeta {
	
	
	
	
	public PontodeColeta(int id_Col, String nomeColeta, String endereco, String cidade, String bairro, String estado,
			String tipo) {
		super();
		this.id_Col = id_Col;
		NomeColeta = nomeColeta;
		Endereco = endereco;
		Cidade = cidade;
		Bairro = bairro;
		Estado = estado;
		Tipo = tipo;
	}
	
	private int id_Col;
	private String NomeColeta;
	private String Endereco;
	private String Cidade;
	private String Bairro;
	private String Estado;
	private String Tipo;
	
	public int getId_Col() {
		return id_Col;
	}
	public void setId_Col(int id_Col) {
		this.id_Col = id_Col;
	}
	public String getNomeColeta() {
		return NomeColeta;
	}
	public void setNomeColeta(String nomeColeta) {
		NomeColeta = nomeColeta;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
	
}
