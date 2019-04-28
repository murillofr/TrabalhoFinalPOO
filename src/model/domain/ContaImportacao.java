package model.domain;

public class ContaImportacao implements Lote {
	
	private char tipo;
	private String cpf;
	private Double valorLimite;
	private Integer diaVencimentoFatura;
	private String numeroConta;
	private String tipolote;
	
	public ContaImportacao() {
		
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
	
	public Double getValorLimite() {
		return valorLimite;
	}
	
	public void setValorLimite(Double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	public Integer getDiaVencimentoFatura() {
		return diaVencimentoFatura;
	}
	
	public void setDiaVencimentoFatura(Integer diaVencimentoFatura) {
		this.diaVencimentoFatura = diaVencimentoFatura;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	@Override
	public String getTipoLote() {
		return "Conta";
	}
	
    public void setTipoLote(String tl) {
        this.tipolote = tl;
    }
	
	public String toString() {
		return "\n    ContaImportacao\n" + 
			   "    Tipo: " + tipo + "\n" + 
			   "    CPF: " + cpf + "\n" + 
			   "    Valor do Limite: " + valorLimite + "\n" + 
			   "    Dia de Vencimento: " + diaVencimentoFatura + "\n" + 
			   "    N�mero da Conta: " + numeroConta + "\n";
	}
	
}