import java.util.Scanner;

public class Operaciones {
    
    public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);
    
     System.out.println("Elige la opcion que quieras:(1 o 2)");
     System.out.println("1.Multiplicar");
     System.out.println("2.Dividir");
     int opcion = teclado.nextInt();
     System.out.println("Introduce un numero: ");
     int numero1 = teclado.nextInt();
     System.out.println("Introduce un numero: ");
     int numero2 = teclado.nextInt();
     
     switch (opcion) {
        case 1:
            int resultado = numero1 * numero2;
            System.out.println("El resultado es " + resultado);
            break;
        
        case 2:
            int resultado2 = numero1 / numero2;
            System.out.println("El resultado es " + resultado2);
            break;
     
        default:
            System.out.println("Tienes que elegir una opcion (1 o 2)");
            break;
        }
     } 
}

