package bo.edu.cursojava;

public class Main {

    public static void main(String[] args) {


        Ventana ventana = new Ventana("Inicio Sesion");
        ventana.insertarNombre("pepito");
        ventana.insertarPassword("1234");
        boolean respuesta= ventana.validar();

        if (respuesta){
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Incorrecto");
        }


    }
}
