import java.util.Scanner;
import javax.swing.JOptionPane;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre?: ");

        String nombre = sc.nextLine();

        JOptionPane.showMessageDialog(null, "Hola mundo.");

        
        JOptionPane.showMessageDialog(null, "Bienvenido:" + nombre);

















    }




}