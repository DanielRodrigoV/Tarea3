import java.util.Scanner;
public class Tarea3Aux
{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        String nombre,apellido;
        
        System.out.println("Ingresa un nombre");
        nombre=teclado.nextLine();
        
        System.out.println("Ingresa un apellido");
        apellido=teclado.nextLine();
        
        System.out.println("Hola mi nombre es: "+nombre);
        System.out.println("Mi apellido es: "+apellido);

        
    }
}
