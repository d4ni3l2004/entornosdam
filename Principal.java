import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
	public static void main(String[] args) {
        String fechaHoraActual = obtenerFechaHoraActual();
        System.out.println("La fecha y hora actual es: " + fechaHoraActual);
    }

    public static String obtenerFechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatter);

        return fechaHoraFormateada;
	}
}
