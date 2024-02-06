import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fechaHoraActual = obtenerFechaHoraActual();
        System.out.println("La fecha y hora actual es: " + fechaHoraActual);

        System.out.print("Dime la cantidad de usuarios: ");
        int tamanyo = sc.nextInt();
        sc.nextLine();

        Usuario[] usuarios = arrayUsuario(tamanyo);

        System.out.println();
        System.out.println("Usuario");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);        
        }
        sc.close();
    }

    public static Usuario[] arrayUsuario(int tamanyo) {
        Scanner sc = new Scanner(System.in);
        
        Usuario[] usuarios = new Usuario[tamanyo];

        for (int i = 0; i < tamanyo; i++) {
            System.out.print("Dime el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Dime los apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("Dime el email: ");
            String email = sc.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        return usuarios;
    }

    public static String obtenerFechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formatter);

        return fechaHoraFormateada;
	}
}
