
public class Main {

    public static void main(String[] args) {

// DECLARAMOS OBJETOS 
	
	Cliente cliente = new Cliente();
	Trabajador trabajador = new Trabajador();

//DATOS CLIENTE
	
	cliente.nombre = "Paco";
	cliente.edad = "30";
	cliente.tlf = "123456789";
	cliente.credito = "500";

// DATOS TRABAJADOR	

	trabajador.nombre = "Antonio S";
	trabajador.edad = "50";
	trabajador.tlf = "987654321";
	trabajador.credito = "1000";

//MUESTRA DE DATOS POR PANTALLA

System.out.println("El clente se llama "+ cliente.nombre +" ,tiene "+ cliente.edad +
" años ,su numero de contacto es el "+cliente.tlf+", y su credito disponible es de "+cliente.credito+"$");	

System.out.println("El trabajador se llama "+ trabajador.nombre +" ,tiene "+ trabajador.edad +
" años ,su numero de contacto es el "+trabajador.tlf+", y su credito disponible es de "+ trabajador.credito+"$");		
	
 }
}

class Persona {

    public String nombre;
    public int edad;
    public int tlf;

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

class Cliente extends Persona{
	public double credito;
}

class Trabajador extends Persona{
	public double salario;
}
