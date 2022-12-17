package prueba;

public class Main {

    public static void main (String args[]){

        Empleados empleado1 = new Empleados("Brodely");

        Empleados empleado2 = new Empleados("Oscar");

        empleado2.setCambiarSeccion("Recursos Humanos");

        System.out.println(empleado1.getInformacionEmpleado());
        System.out.println(empleado2.getInformacionEmpleado());
    }
}

class Empleados{

    private final String nombre; //Al volver a la variable una constante una vez le das el nombre en el constructor
                                 // esta NO PUEDE CAMBIARSE (Palabra reservada "final")

    private String seccion;//Encapculación de variables
    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
    }

    //Getter
    public String getInformacionEmpleado(){
        return "El nombre es: " + nombre + " y tu seccion es " + seccion;
    }

    //Setter
    public void setCambiarSeccion(String seccion){
        this.seccion = seccion;
    }


}
