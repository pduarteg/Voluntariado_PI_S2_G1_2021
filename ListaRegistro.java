package voluntariado;
public class ListaRegistro{
	Registro primero = null;

	public void agregarRegistro(Registro nuevo){
		if(this.primero == null){
			this.primero = nuevo;
		} else {
			Registro temporal = this.primero;

			while(temporal.siguiente != null){
				temporal = temporal.siguiente;
			}
			temporal.siguiente = nuevo;
		}
	}
}