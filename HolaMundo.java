import java.util.Scanner; // Importación de Scanner
import javax.swing.JOptionPane; // Importación de JOptionPane

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre?: "); // Solicitar nombre al usuario

        String nombre = sc.nextLine(); // Guardar el nombre ingresado por el usuario

        JOptionPane.showMessageDialog(null, "Hola mundo."); // Mostrar mensaje de bienvenida por la interfaz gráfica de JOptionPane
        JOptionPane.showMessageDialog(null, "Somos Luis, Jose y Juanpis, estudiantes de lógica de programación"); // Mensaje de presntación del equipo
        JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre); //Mensaje personalizado con el nombre del usuario
















    }




}