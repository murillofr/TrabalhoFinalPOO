package model.domain;

public class PlasticoImportacao implements Lote {
	
    private char detalhe;
    private String numerodaconta;
    private String nome_inserido_plastico;
    private String cpf;
    private String numero_plastico_gerado;
    private String numeroLote;
    private String tipolote;
    
    public char getDetalhe() {
        return detalhe;
    }
    
    public void setDetalhe(char detalhe) {
        this.detalhe = detalhe;
    }
    
    public String getNumerodaconta() {
        return numerodaconta;
    }
    
    public void setNumerodaconta(String numerodaconta) {
        this.numerodaconta = numerodaconta;
    }
    
    public String getNome_inserido_plastico() {
        return nome_inserido_plastico;
    }
    
    public void setNome_inserido_plastico(String nome_inserido_plastico) {
        this.nome_inserido_plastico = nome_inserido_plastico;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNumero_plastico_gerado() {
        return numero_plastico_gerado;
    }
    
    public void setNumero_plastico_gerado(String numero_plastico_gerado) {
        this.numero_plastico_gerado = numero_plastico_gerado;
    }
    
    public String getNumeroLote() {
        return numeroLote;
    }
    
    public void setNumeroLote(String lote) {
        this.numeroLote = lote;
    }
    
    @Override
    public String getTipoLote() {
        return "Plastico";
    }
    
    public void setTipoLote(String tl) {
        this.tipolote = tl;
    }
	
	public String toString() {
		return "\n    PlasticoImportacao\n" + 
			   "    Detalhe: " + detalhe + "\n" + 
			   "    Número da Conta: " + numerodaconta + "\n" + 
			   "    Nome no Plástico: " + nome_inserido_plastico + "\n" + 
			   "    CPF: " + cpf + "\n" + 
			   "    Número do Cartão: " + numero_plastico_gerado + "\n" + 
			   "    Lote: " + numeroLote + "\n";
	}
	
}