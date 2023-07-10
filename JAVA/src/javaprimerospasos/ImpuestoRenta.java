package javaprimerospasos;

public class ImpuestoRenta {
	public static void main(String[] args) {


		double salario = 1900.0;
		
		if (salario >= 1900 && salario <= 2800.0 ) {
			System.out.println("el IR es de 7,5% y puede deducir "
					+ "de la declaracion el monton de $142");
		} if(salario >= 2800.01 && salario <= 3751.0 ) {
			System.out.println("el IR es del 15% y puede deducir $350");
		}if (salario >= 3751.01 && salario <= 4664.0 ) {
			System.out.println("el IR es 22.5% y puede deducir $636");
			
	}}
}
