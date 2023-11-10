package clases;

import java.util.ArrayList;


public class Logica {
	
	Double IMC;
	String conclusion;
	ArrayList<UsuarioVo> listaUsuarios;

	public Logica() {
		listaUsuarios = new ArrayList<UsuarioVo>();
	}

	public String Registrar(UsuarioVo miUser) {
			String res = "Registro Exitoso\n";
			res += "Documento:" + miUser.getDocumento() + "\n";
			res += "Nombre:" + miUser.getNombre() + "\n";
			res += "Edad:" + miUser.getEdad() + "\n";
			res += "Talla:" + miUser.getTalla() + "\n";
			res += "Peso:" + miUser.getPeso() + "\n";
			IMC = miUser.getPeso()/(miUser.getTalla()*miUser.getTalla());
			conclusion = calcularIMC(IMC);
			miUser.setIMC(IMC);
			res += "El IMC es " + miUser.getIMC() + " su indice indica que usted tiene " +  conclusion + "\n";
			res += "-------------------------------------";
			listaUsuarios.add(miUser);
			
			return res;
	}
	
	

	private String calcularIMC(double valIMC) {
		 String msj = "";
		if (valIMC < 18) {
			msj += "Anorexica";
		} else if(valIMC >= 18 && valIMC <20) {
			msj += "Delgadez";
		} else if(valIMC >= 20 && valIMC <27) {
			msj += "Normalidad";
		} else if(valIMC >= 27 && valIMC <30) {
			msj += "Obesidad (grado 1)";
		} else if(valIMC >= 30 && valIMC <35) {
			msj += "Obesidad (grado 2)";
		} else if(valIMC >= 35 && valIMC <40) {
			msj += "Obesidad (grado 3)";
		} else{
			msj += "Obesidad mórbia";
		}
		return msj;
	}

	public String imprimirLista() {
		String res = "Lista Usuarios\n";
		 UsuarioVo miUser = null;
		
		for (int i = 0; i < listaUsuarios.size(); i++) {
			miUser = listaUsuarios.get(i);
			res += "Documento:" + miUser.getDocumento() + "\n";
			res += "Nombre:" + miUser.getNombre() + "\n";
			res += "Edad:" + miUser.getEdad() + "\n";
			res += "Talla:" + miUser.getTalla() + "\n";
			res += "Peso:" + miUser.getPeso() + "\n";
			res += "El IMC es " + miUser.getIMC() + " su indice indica que usted tiene " +  conclusion + "\n";
			res += conclusion + "\n";
			res += "-----------------------------------------------------------------------\n";
		}
		return res;
	}

	public String calcularPromedio() {
		String res = "";
		Double sum = 0.0;
		for (int i = 0; i < listaUsuarios.size(); i++) {
			sum = sum + listaUsuarios.get(i).getIMC();
		}
		double prom = sum/listaUsuarios.size();
		res = "el IMC promedio es " + prom + "\nsegun el IMC promedio los usuarios en promedio tienen " +  conclusion + "\n";
		return res;
	}


}
