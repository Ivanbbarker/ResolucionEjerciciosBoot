
public class Main {

    public static void main(String[] args) {

//Declaramos nuestro Objeto Persona

        Persona persona = new Persona();

//Damos valores a nuestros parametros de nuestro nuevo objeto Persona

        persona.setNombre("Ivan");        
        persona.setEdad(23);
        persona.setTlf(123456789);
       

//Mostramos los datos guardados en nuestro objeto Persona

	System.out.println("Mi nombre es " + persona.getNombre());
	System.out.println("Tengo una edad de " + persona.getEdad() + " años");  
	System.out.println("Mi teléfono es: " + persona.getTelefono());


 }
}

class Persona {

    private String nombre;
    private int edad;
    private int tlf;

  public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

  public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

  public void setTlf(int tlf){
        this.tlf = tlf;
    }

    public int getTelefono() {
        return telefono;
    }
}
