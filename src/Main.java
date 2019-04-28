import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
        File arquivos[] = LeituraDiretorio.getArquivosDiretorio();
        String diretorio = LeituraDiretorio.getDiretorio();
        
        Arrays.sort(arquivos);
        
        for (File arquivo : arquivos) {
            LeituraArquivo leitura = new LeituraArquivo();
            List<String> lista = leitura.lerArquivo(diretorio + arquivo.getName());
            String nomeArquivo=  leitura.getNomeArquivo();
            ProcessadoraArquivo processadora;
            processadora = new ProcessadoraArquivo(ProcessadoraInjetora.getProcessadorLinha(nomeArquivo));
            System.out.println(processadora.processaArquivo(lista) + "\n");
        }
    }
	
}
