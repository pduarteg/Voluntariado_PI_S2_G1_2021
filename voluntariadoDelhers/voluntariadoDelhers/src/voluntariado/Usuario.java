
package voluntariado;
public class Usuario{
	String nombre;
	String contrasenia;
        
        Usuario siguiente;

	public Usuario(String n, String c){
		this.nombre = n;
		this.contrasenia = c;
                this.siguiente = null;
	}
}