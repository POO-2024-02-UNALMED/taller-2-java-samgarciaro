public class Motor {
	Integer numeroCilindros;
	String tipo;
	Integer registro;
	public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String tipo) {
        if (tipo.equals("electrico")) {
            this.tipo = tipo;
        }
        else if (tipo.equals("gasolina")) {
        	this.tipo = tipo;
        }
        else {
        	System.out.println("Tipo no permitido");
        }
    }
}
