package bo.edu.cursojava;

public class Ventana {
    private String titulo;
    private Boton entrar;
    private Etiqueta etiquetaNombre, etiquetaPassword;
    private CampoTexto campoNombre, campoPassword;

    public Ventana(String titulo) {
        this.titulo = titulo;
        this.entrar = new Boton("Entrar");
        this.etiquetaNombre = new Etiqueta("Nombre");
        this.etiquetaPassword = new Etiqueta("Contraseña");
        this.campoNombre = new CampoTexto("");
        this.campoPassword = new CampoTexto("");

    }

    public void insertarNombre(String nombre) {
        this.campoNombre.setTexto(nombre);
    }

    public void insertarPassword(String texto) {
        this.campoPassword.setTexto(texto);
    }

    public boolean validar() {
        String nomnbre = campoNombre.getTexto();
        String pass = campoPassword.getTexto();

        return nomnbre.equals("pepito") && pass.equals("1234");
    }
}
