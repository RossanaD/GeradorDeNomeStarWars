
public class NameGenerator {
	
	 public String generateStarWarsName(String[] entrada) {
		 String NomeStarWars; 

		 String aux = null;
		 String Parte1Nome;
		 int pos = entrada[0].lastIndexOf(" ");
		 if(pos != 1) {
			 aux = entrada[0].substring(pos+1);
		 }
		 Parte1Nome = aux.substring(0, 3);		 
		 String Parte2Nome = entrada[0].substring(0, 2);
		 	 

		 String ParteSobrenome1 = entrada[1].substring(0, 2);
		 String ParteSobrenome2 = entrada[2].substring(0, 3);
		 

		 NomeStarWars = Parte1Nome+Parte2Nome+" "+ParteSobrenome1+ParteSobrenome2;
		 return NomeStarWars;
	 }
}
