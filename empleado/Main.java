package empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main (String args[]){

        /*
        Empleado empleado1 = new Empleado("Brodely",2000,2022,12,17);

        Empleado empleado2 = new Empleado("Oscar",3000,2020,11,18);

        Empleado empleado3 = new Empleado("Angel",4000,2021,10,19);

        empleado1.setAumentoDeSueldo(20);
        empleado2.setAumentoDeSueldo(5);
        empleado3.setAumentoDeSueldo(2);

        System.out.println("Nombre: " +empleado1.getNombre());
        System.out.println("Sueldo: " +empleado1.getSueldo());
        System.out.println("Fecha de Alta: " +empleado1.getFechaAlta());
        */

        //Ejemplo con Array para Entender Logica
        String[] texto = new String[1];
        texto[0] = "Hola";

        //Creando array de Objetos Empleado
        Empleado[] misEmpleados = new Empleado[3];

        //Para llenarlos se llama el metodo constructor con sus respectivos parametros
        misEmpleados[0] = new Empleado("Brodely",2000,2022,12,17);
        misEmpleados[1] = new Empleado("Oscar",3000,2020,11,18);
        misEmpleados[2] = new Empleado("Angel",4000,2021,10,19);

        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].setAumentoDeSueldo(5);
        }

        for (Empleado empleadosForEach: misEmpleados) {
            System.out.println(empleadosForEach.getNombre());
            System.out.println(empleadosForEach.getSueldo());
            System.out.println(empleadosForEach.getFechaAlta());
            System.out.println();
        }
    }
}

class Empleado{//Solo la clase principal con el main debe tener el public

    private String nombre;
    private double sueldo;
    private Date fechaAlta;

    public Empleado(String nombre, double sueldo, int anio, int mes, int dia){

        this.nombre = nombre;
        this.sueldo= sueldo;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia); //Recibe parametros de tipo int
        //En GregorianCalendar el mes se comienza desde 0 perteneciendo a enero este valor
        fechaAlta = calendario.getTime(); //Convierte con el metodo constructor GregorianCalendar a tipo de dato Date

    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public Date getFechaAlta(){
        return fechaAlta;
    }

    //SETTER Para generar aumento de sueldo
    public void setAumentoDeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }

}
