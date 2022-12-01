package org.arca.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class TesteBase64 {

	static String nome = "Marcos é um cara qualquer!";
	
	public static void main(String[] args) {
		
		System.out.println("Texto Original: "+nome);
		try {
			String codificado = Base64.getEncoder().encodeToString(nome.getBytes("utf-8"));
			 // Codificar URL
			Base64.getUrlEncoder();
			
			System.out.println("Codificado: "+codificado);
			String decodificad = new String(Base64.getDecoder().decode(codificado), "utf-8");
			System.out.println("Decodificado: "+decodificad);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
