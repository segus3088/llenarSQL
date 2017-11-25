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