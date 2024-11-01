package exame;

public class Exame {

		private int idExame;
		private int nivelGlicose;
		
		public Exame(int idExame, int nivelGlicose) {
			this.idExame = idExame;
			this.nivelGlicose = nivelGlicose; 
		}
		
		public int getIdExame(){
			return idExame;
		}
		
		public int getNivelGlicose(){
			return nivelGlicose;
		}
		
		public String obterDiagnostico() {
			 if(nivelGlicose <= 99) {
				 return "Nivel de glicose normal";
			 }
			 
			 else if(nivelGlicose <= 125) {
				 return "Pré-diabético";
			 }
			 
			 else {
				 return "Diabético";
			 }
		}
}

