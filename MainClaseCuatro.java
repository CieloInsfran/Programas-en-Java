package com.educacionit.clasecuatro;

import java.util.Date;

public class MainClaseCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date fechayhora = new Date();
		System.out.println(fechayhora);
		int numeroDia = 4;
		System.out.println(numeroDia);
		String nombreDia = "";
		if(numeroDia == 0) nombreDia = "Domingo";
		else if (numeroDia == 1) nombreDia = "Lunes";
		else if (numeroDia == 2) nombreDia = "Martes";
		else if (numeroDia == 3) nombreDia = "Miercoles";
		else if (numeroDia == 4) nombreDia = "Jueves";
		else if (numeroDia == 5) nombreDia = "Viernes";
		else if (numeroDia == 6) nombreDia = "Sabado";
		else nombreDia = "Dia desconocido";
		System.out.println("El numero del dia es : "  +numeroDia);
		System.out.println("El dia de hoy es : " +nombreDia);
	
	}

}
