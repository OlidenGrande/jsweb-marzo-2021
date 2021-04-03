package ar.com.educacionit.clase4.enums;

public class TipoEnumMain {

	public static void main(String[] args) {
		
		Tipo csv = Tipo.CSV;
		
		String resultado = exportar(csv);
		System.out.println(resultado);
	}
	
	public static String exportar(Tipo tipo) {
		
		String resultado;
		if(Tipo.CSV.equals(tipo)) {
			resultado = "Generando CSV";
		}else if(Tipo.TXT.equals(tipo)) {
			resultado = "Generando TXT";
		}else {
			resultado = "Generando XLS";
		}
		return resultado;
	}

}
