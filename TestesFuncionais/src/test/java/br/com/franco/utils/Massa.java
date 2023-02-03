package br.com.franco.utils;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;



import net.bytebuddy.utility.RandomString;

public class Massa {
	
	public static String nomeCadastro = RandomString.make(8);
	
	public static String senhaCadastro = RandomString.make(5);
	
	public static String geradorEmail = RandomString.make(4);
	public static String dominioEmail = "@franco.com";
	public static String emailCadastro = (geradorEmail+dominioEmail);
	public static String contaCadastro = RandomString.make(6);
	
	
	
	
	
	public static String getContaCadastro() {
		return contaCadastro;
	}
	public static void setContaCadastro(String contaCadastro) {
		Massa.contaCadastro = contaCadastro;
	}
	public static String getNomeCadastro() {
		return nomeCadastro;
	}
	public static void setNomeCadastro(String nomeCadastro) {
		Massa.nomeCadastro = nomeCadastro;
	}
	
	public static String getSenhaCadastro() {
		return senhaCadastro;
	}
	public static void setSenhaCadastro(String senhaCadastro) {
		Massa.senhaCadastro = senhaCadastro;
	}

	public static String getEmailCadastro() {
		return emailCadastro;
	}
	public static void setEmailCadastro(String emailCadastro) {
		Massa.emailCadastro = emailCadastro;
	}
	

	
	
	
	
	
	
	
	
	

}
