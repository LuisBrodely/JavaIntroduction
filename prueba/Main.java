package prueba;

public class Main {

    public static void main (String[] args){

        Empleados empleado1 = new Empleados("Brodely");

        Empleados empleado2 = new Empleados("Oscar");

        Empleados empleado3 = new Empleados("Manuel");

        empleado2.setCambiarSeccion("Recursos Humanos");

        System.out.println(empleado1.getInformacionEmpleado());

        System.out.println(empleado2.getInformacionEmpleado());

        System.out.println(empleado3.getInformacionEmpleado());

        System.out.println(Empleados.getStaticIDSiguiente());
    }
}

class Empleados{

    private final String nombre; //Al volver a la variable una constante una vez le das el nombre en el constructor
                                 // esta NO PUEDE CAMBIARSE (Palabra reservada "final")
    private String seccion;//Encapculación de variables

    private int id;
    private static int idSiguiente = 1;
    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion";
        id = idSiguiente;
        idSiguiente++;
    }

    //Getter
    public String getInformacionEmpleado(){
        return "El nombre es: " + nombre + " y tu seccion es " + seccion + " y tu ID: " + id;
    }

    //Setter
    public void setCambiarSeccion(String seccion){
        this.seccion = seccion;
    }


    //STATIC : NO ACTUAN SOBRE OBJETOS DECLARADOS
    //METODO STATIC (El Objeto Math todos sus metodos son estaticos es por ello que no debe crearse el objeto :0)
    //No puede acceder a variables que no sean static
    public static String getStaticIDSiguiente(){
        return "El ID siguiente es: "+ idSiguiente;
    }


}
