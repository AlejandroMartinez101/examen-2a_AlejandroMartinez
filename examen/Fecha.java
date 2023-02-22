package examen;
/** Clase para validar la fecha proporcionada.
 * 
 * @author Alejandro Martinez
 * @version 2.0
 * 
 * 
 */
public class Fecha {
//atributo que dicta si es correcta o no una fecha.
	private static boolean fechaValida;
/**
 * Metodo que se utiliza para validar si la fecha que nos proporcionan es valida o no.
 * 
 * @param anio
 * @param mes
 * @param dia
 * @return "true" o "false" en funcion de si la fecha es correcta o no.
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}