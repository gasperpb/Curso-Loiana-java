package aula_16;

import java.util.Scanner;

public class questao_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		   boolean valido= false;
		
		   do { 
			   
			   
			   System.out.println( "Digite a nota entre 0 a 10");
		   
			int nota = sc.nextInt();
		
		
		if (nota>=0 && nota<=10) {
			valido = true;
		
			System.out.println("voce digitou:  "+nota);
		}else {
				System.out.println("voce digitou a nota invalida");
			}}
			
		  while (!valido);
		  
		  	
		  
		   }}
