package model.domain;

import java.util.Date;

public class ClienteImportacao implements Lote {
	
	private char tipo;
	private String cpf;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private Date dataHoraCadastro;
    private String numeroLote;
    private String tipolote;
    
    public ClienteImportacao() {
    	
    }
	
	public char getTipo() {
		return tipo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Date getDataHoraCadastro() {
		return dataHoraCadastro;
	}
	
	public void setDataHoraCadastro(Date dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
	
    public String getNumeroLote() {
        return numeroLote;
    }
	
    public void setNumeroLote(String lote) {
        this.numeroLote = lote;
    }
    
    @Override
	public String getTipoLote() {
		return "Cliente";
	}
	
    public void setTipoLote(String tl) {
        this.tipolote = tl;
    }
    
	public String toString() {
		return "\n    ClienteImportacao\n" + 
			   "    Tipo: " + tipo + "\n" + 
			   "    CPF: " + cpf + "\n" + 
			   "    Nome: " + nome + "\n" + 
			   "    Endereco: " + endereco + "\n" + 
			   "    Bairro: " + bairro + "\n" + 
			   "    Cidade: " + cidade + "\n" + 
			   "    Estado: " + estado + "\n" + 
			   "    DataHoraCadastro: " + dataHoraCadastro + "\n" + 
			   "    Lote: " + numeroLote + "\n";
	}
	
}