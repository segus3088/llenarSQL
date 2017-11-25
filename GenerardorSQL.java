import java.util.Random;
import javax.swing.JOptionPane;

public class GenerardorSQL {

	public static void main(String[] args) {

		//log("Hola");
		int n;//cantidad datos a generar
		//n = Integer.parseInt(args[0]); // con esto tomo por consola la cantidade Datos a generar

		GenerardorSQL objetoM = new GenerardorSQL();

		objetoM.menu();

	}

	private String tabla = "";
	private int cantidadRegistros = 0;
	private int cantidadCampos = 0;

	private void menu(){
		//log("estoy en el menu");
		int opcion = 1;
		while (opcion >= 1 || opcion <= 4) {
		
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione lo que quiere hacer: \n1. Nombrar tabla\n2. Colocar cantidad de registros a crear\n3. Colocar cantidad de campos\n4. Generar archivo y salir"));

			if (opcion == 1) {
				this.setTabla();
				
			} else if (opcion == 2) {
				this.setcantidadRegistros();
				
			} else if (opcion == 3) {
				this.setcantidadCampos();
				
			} else if (opcion == 4) {
				this.generarSalida();
			}
		}
		
	}

	private void setTabla(){
		this.tabla = JOptionPane.showInputDialog(null, "Colocar nombre de la tabla");
	}

	private void setcantidadRegistros(){
		this.cantidadRegistros = Integer.parseInt(JOptionPane.showInputDialog(null, "Colocar cantidad de registros a crear"));
	}

	private void setcantidadCampos(){
		this.cantidadCampos = Integer.parseInt(JOptionPane.showInputDialog(null, "Colocar cantidad campos tabla"));
	}

	private void generarSalida(){
		//log("salida de archivo");
		int tipoRegistro = 0;

		log("INSERT INTO" + this.getTabla());
		log("VALUES (");

		for (int i = 0 ;i < this.getcantidadRegistros() ; i++) {
			tipoRegistro = Integer.parseInt(JOptionPane.showInputDialog(null, "Para el campo " + i + "¿qué dato aleatorio quiere poner (0) un código, \n(1) un nombre, \n(2) un apellido, \n(3) una ciudad, \n(4) una dirección de correo, \n(5) una dirección de ciudad, \n(6) un tipo de sangre, \n(7) un número entero, \n(8) un número real, \n(9) una letra, \n(10) un texto aleatorio, \n(11) Una IPv4, \n(12) Una IPv6, \n(13) un texto formateado?"));
			
			if (tipoRegistro == 0) {
				
			} else if (tipoRegistro == 1) {
				
			} else if (tipoRegistro == 2) {
				
			} else if (tipoRegistro == 3) {
				
			} else if (tipoRegistro == 4) {
				
			} else if (tipoRegistro == 5) {
				
			} else if (tipoRegistro == 6) {
				
			} else if (tipoRegistro == 7) {
				
			} else if (tipoRegistro == 8) {
				
			} else if (tipoRegistro == 9) {
				
			} else if (tipoRegistro == 10) {
				
			} else if (tipoRegistro == 11) {
				
			} else if (tipoRegistro == 12) {
				
			} else if (tipoRegistro == 13) {
				
			}

		}

		log(");");

		System.exit(0);
	}

	private String getTabla(){
		return this.tabla;
	}

	private int getcantidadRegistros(){
		return this.cantidadRegistros;
	}

	private int getTablacantidadCampos(){
		return this.cantidadCampos;
	}

	private static void log(Object aMensajito){
		System.out.println(String.valueOf(aMensajito));
	}
	
}