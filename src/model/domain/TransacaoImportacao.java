package model.domain;

public class TransacaoImportacao implements Lote {
	
    private char detalhe;
    private String numeroconta;
    private String numeroplastico;
    private double valortransacao;
    private String datatransacao;
    private String horatransacao;
    private String codigoestabelecimento;
    private String numeroLote;
    private String tipolote;
    
    public char getDetalhe() {
        return detalhe;
    }
    
    public void setDetalhe(char detalhe) {
        this.detalhe = detalhe;
    }
    
    public String getNumeroconta() {
        return numeroconta;
    }
    
    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }
    
    public String getNumeroplastico() {
        return numeroplastico;
    }
    
    public void setNumeroplastico(String numeroplastico) {
        this.numeroplastico = numeroplastico;
    }
    
    public double getValortransacao() {
        return valortransacao;
    }
    
    public void setValortransacao(double valortransacao) {
        this.valortransacao = valortransacao;
    }
    
    public String getDatatransacao() {
        return datatransacao;
    }
    
    public void setDatatransacao(String datatransacao) {
        this.datatransacao = datatransacao;
    }
    
    public String getHoratransacao() {
        return horatransacao;
    }
    
    public void setHoratransacao(String horatransacao) {
        this.horatransacao = horatransacao;
    }
    
    public String getCodigoestabelecimento() {
        return codigoestabelecimento;
    }
    
    public void setCodigoestabelecimento(String codigoestabelecimento) {
        this.codigoestabelecimento = codigoestabelecimento;
    }
    
    public String getNumeroLote() {
        return numeroLote;
    }
    
    public void setNumeroLote(String lote) {
        this.numeroLote = lote;
    }
    
    @Override
    public String getTipoLote() {
        return "Transacao";
    }
    
    public void setTipoLote(String tl) {
        this.tipolote = tl;
    }
    
	public String toString() {
		return "\n    Transacao\n" + 
			   "    Detalhe: " + detalhe + "\n" + 
			   "    Número da Conta: " + numeroconta + "\n" + 
			   "    Número do Cartão: " + numeroplastico + "\n" + 
			   "    Valor da Transação: " + valortransacao + "\n" + 
			   "    Data: " + datatransacao + "\n" + 
			   "    Hora: " + horatransacao + "\n" + 
			   "    Código do Estabelecimento: " + codigoestabelecimento + "\n" + 
			   "    Número do Lote: " + numeroLote + "\n";
	}
	
}
