import java.io.File;

public class LeituraDiretorio {
	
    private static File arquivos[];
    private static String diretorio;
    private static File documentos;
    
    public static File[] getArquivosDiretorio() {
		diretorio = System.getProperty("user.dir") + "/src/arquivos/";
		documentos= new File(diretorio);
		arquivos= documentos.listFiles();
		return arquivos;
    }
    
    public static String getDiretorio() {
        return diretorio;
    }
	
}