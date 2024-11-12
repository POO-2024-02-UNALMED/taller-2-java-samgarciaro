public class Auto {
	String modelo;
	Integer precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	Integer registro;
	String cantidadCreados;

	public int cantidadAsientos() {
	    int contador = 0;
	    for (Asiento asiento : asientos) {
	        if (asiento != null) {
	            contador++;
	        }
	    }
	    return contador;
	}
	public String verificarIntegridad() {
        if (motor.registro.equals(this.registro)) {
            return "Las piezas son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento.registro.equals(this.registro)) {
                return "Las piezas son originales";
            }
        }
        return "Auto original";
    }
}