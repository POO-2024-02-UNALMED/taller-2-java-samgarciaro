package parte_1_java_semana_2;
public class Asiento {
	String color;
	Integer precio;
	Integer registro;


	public void cambiarColor(String color) {
		 if (color.equalsIgnoreCase("rojo")) {
	            this.color = color;
	        } else if (color.equalsIgnoreCase("verde")) {
	            this.color = color;
	        } else if (color.equalsIgnoreCase("amarillo")) {
	            this.color = color;
	        } else if (color.equalsIgnoreCase("negro")) {
	            this.color = color;
	        } else if (color.equalsIgnoreCase("blanco")) {
	            this.color = color;
	        } else {
	            System.out.println("Color no permitido, no se ha cambiado el color.");
	        }
	    }
	}