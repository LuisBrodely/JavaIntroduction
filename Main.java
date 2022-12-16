import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        System.out.println("Hola Mundo :D");

        Scanner in = new Scanner(System.in);

        int aleatorio = (int)(Math.random()*10);

        int numero = 0;
        int intentos = 0;

        System.out.println(aleatorio);

        while (numero!=aleatorio){
            intentos++;
            System.out.println("Ingresa un numero del 1 al 10");
            numero = in.nextInt();

            if (numero > aleatorio){
                System.out.println("Es mayor que el numero aleatorio");
            } else if (numero < aleatorio) {
                System.out.println("Es menor que el numero aleatorio");
            }
        }
        System.out.println("Es correcto, el numero aleatorio era " + aleatorio);
        System.out.println("Te tomo " + intentos + " intentos");

    }
}
