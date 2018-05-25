package aula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	public void inserir(String texto) throws IOException {
		//Gravação
		 FileWriter arq = new FileWriter("d:\\teste.txt",true);
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 gravarArq.println(texto); 

		 arq.close();
	}
	
	public void leitura(String texto) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains(texto)) {
	    		 System.out.println("linha: " + i + " conteúdo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	}
	
	public void atualizar(String texto, String textNew) throws IOException {
		//Leitura
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine();
	     int i = 0;
	     String textOld = "";
		
	     while (linha != null) {
	    	 i++;
	    	
	    	 if(linha.contains(texto)) {
	    		 
	    		 textOld += linha.replaceAll(linha, textNew) + "\n";
	    		 
	    	 }else {
	    		 textOld += linha + "\n";
	    	 }
	    	 linha = lerArq.readLine();
	     }
		 
	     System.out.println(textOld);
		 arqleitura.close();
	}
	
	public void Excluir(String texto) throws IOException {
		//excluir
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine();
	     int i = 0;
	     String textOld = "";
		
	     while (linha != null) {
	    	 i++;
	    	
	    	 if(linha.contains(texto)) {
	    		 
	    		 textOld += linha.replaceAll(linha," ") + "\n";
	    		 
	    	 }else {
	    		 textOld += linha + "\n";
	    	 }
	    	 linha = lerArq.readLine();
	     }
		 
	     System.out.println(textOld);
		 arqleitura.close();
	}
	
	public static void main(String args[]) throws Exception {
		Arquivo arq = new Arquivo();
		//arq.inserir("Paulo");
		//arq.inserir("Pedro");
		//arq.leitura("Pedro");
		//arq.atualizar("Paulo","Amanda");
		arq.Excluir("Amanda");
	}
}
