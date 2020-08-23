package aula_16;

import java.util.Scanner;

public class questao_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   boolean valido= false;
		
		   do { 
			   
			   
		   System.out.println( "Digite seu nome");
		   String  nome = sc.nextLine();
		   System.out.println( "Digite sua senha");
		   String  senha = sc.nextLine();
		
		
		if (nome.equalsIgnoreCase(senha)) {
			//valido = false;
		
			System.out.println("voce digitou a senha igual");
		}else {
				System.out.println("voce digitou valido");
			}}
			
		  while (!valido);
		  
		  	
		  
		   }}
