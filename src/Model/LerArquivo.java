package Model;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

	



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

   public ArrayList<String[]> pegarStringDados() {
      ArrayList<String[]>  dados = new ArrayList<>();
    	JFileChooser fileChooser = new JFileChooser();

       
        int resultado = fileChooser.showOpenDialog(null);
       ;
        if (resultado == JFileChooser.APPROVE_OPTION) {
           
            File arquivo = fileChooser.getSelectedFile();
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(arquivo));
			
			reader.readLine();
		
			while (reader.ready()) {
			    
			    String linha = reader.readLine();

			    
			    String[] numeros = linha.split(",");
			    
			    dados.add(numeros);

			   
			   

				}
		}catch(Exception e) {
			
			e.printStackTrace();
		
        }
    
   }
		return dados;
}
//   public ArrayList<Int[]> (ArrayList<String[]> dados,ArrayList<Planeta> p) {
//	   	   
//			 for (int i = 0; i < dados.size(); i++) {
//				 String[] informacao = dados.get(i);
//				 
//				 
//				 
//		   
//		}
//   }



}


