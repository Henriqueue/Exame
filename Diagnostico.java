package exame;

import java.util.Scanner;

public class Diagnostico {
	public static void main(String[] args) {
		Scanner bear = new Scanner(System.in);
		
		System.out.println("Informe o ID do exame: ");
		int idExame = bear.nextInt();
		
		System.out.println("Informe o nível de glicose: ");
		int nivelGlicose = bear.nextInt();
		
		Exame exame = new Exame(idExame, nivelGlicose);
		
		System.out.println("ID do exame: " + exame.getIdExame());
		System.out.println("Nivel de glicose informado: " + exame.getNivelGlicose());
		
		System.out.println("Diagnóstico do paciente: " + exame.obterDiagnostico());
		
	}

}
